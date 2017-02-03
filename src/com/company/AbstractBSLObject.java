package com.company;

/**
 * Created by lab on 03.02.2017.
 */

abstract class AbstractBSLObject {
    public Object metadata;
    public String FileSrc;

    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    public void setFileSrc(String fileSrc) {
        FileSrc = fileSrc;
    }
}

package com.techelevator.tenmo.model;

public enum TransferType {
    // TransferType has transferId fields to indicate the correct ID within the database.
    REQUEST(1), SEND(2);

    int transferId;

    TransferType(int transferId) {
        this.transferId = transferId;
    }

    public int getTransferId() {
        return transferId;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }
}

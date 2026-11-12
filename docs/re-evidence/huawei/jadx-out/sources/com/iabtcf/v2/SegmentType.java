package com.iabtcf.v2;

/* JADX INFO: loaded from: classes20.dex */
public enum SegmentType {
    DEFAULT { // from class: com.iabtcf.v2.SegmentType.1
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return 0;
        }
    },
    DISCLOSED_VENDOR { // from class: com.iabtcf.v2.SegmentType.2
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return 1;
        }
    },
    ALLOWED_VENDOR { // from class: com.iabtcf.v2.SegmentType.3
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return 2;
        }
    },
    PUBLISHER_TC { // from class: com.iabtcf.v2.SegmentType.4
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return 3;
        }
    },
    INVALID { // from class: com.iabtcf.v2.SegmentType.5
        @Override // com.iabtcf.v2.SegmentType
        public int value() {
            return -1;
        }
    };

    public abstract int value();

    public static SegmentType from(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 1) {
            return DISCLOSED_VENDOR;
        }
        if (i == 2) {
            return ALLOWED_VENDOR;
        }
        if (i == 3) {
            return PUBLISHER_TC;
        }
        return INVALID;
    }
}

package io.netty.util;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes2.dex */
public interface ByteProcessor {
    public static final ByteProcessor FIND_NUL = new IndexOfProcessor((byte) 0);
    public static final ByteProcessor FIND_NON_NUL = new IndexNotOfProcessor((byte) 0);
    public static final ByteProcessor FIND_CR = new IndexOfProcessor(HMProSyncDataBaseProfile.DATA_TYPE_PAI);
    public static final ByteProcessor FIND_NON_CR = new IndexNotOfProcessor(HMProSyncDataBaseProfile.DATA_TYPE_PAI);
    public static final ByteProcessor FIND_LF = new IndexOfProcessor((byte) 10);
    public static final ByteProcessor FIND_NON_LF = new IndexNotOfProcessor((byte) 10);
    public static final ByteProcessor FIND_SEMI_COLON = new IndexOfProcessor((byte) 59);
    public static final ByteProcessor FIND_COMMA = new IndexOfProcessor(HMProSyncDataBaseProfile.DATA_STATISTIC_V2);
    public static final ByteProcessor FIND_ASCII_SPACE = new IndexOfProcessor((byte) 32);
    public static final ByteProcessor FIND_CRLF = new ByteProcessor() { // from class: io.netty.util.ByteProcessor.1
        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b2) {
            return (b2 == 13 || b2 == 10) ? false : true;
        }
    };
    public static final ByteProcessor FIND_NON_CRLF = new ByteProcessor() { // from class: io.netty.util.ByteProcessor.2
        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b2) {
            return b2 == 13 || b2 == 10;
        }
    };
    public static final ByteProcessor FIND_LINEAR_WHITESPACE = new ByteProcessor() { // from class: io.netty.util.ByteProcessor.3
        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b2) {
            return (b2 == 32 || b2 == 9) ? false : true;
        }
    };
    public static final ByteProcessor FIND_NON_LINEAR_WHITESPACE = new ByteProcessor() { // from class: io.netty.util.ByteProcessor.4
        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b2) {
            return b2 == 32 || b2 == 9;
        }
    };

    public static class IndexNotOfProcessor implements ByteProcessor {
        private final byte byteToNotFind;

        public IndexNotOfProcessor(byte b2) {
            this.byteToNotFind = b2;
        }

        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b2) {
            return b2 == this.byteToNotFind;
        }
    }

    public static class IndexOfProcessor implements ByteProcessor {
        private final byte byteToFind;

        public IndexOfProcessor(byte b2) {
            this.byteToFind = b2;
        }

        @Override // io.netty.util.ByteProcessor
        public boolean process(byte b2) {
            return b2 != this.byteToFind;
        }
    }

    boolean process(byte b2) throws Exception;
}

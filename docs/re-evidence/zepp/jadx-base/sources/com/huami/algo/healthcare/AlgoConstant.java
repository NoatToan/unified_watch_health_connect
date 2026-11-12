package com.huami.algo.healthcare;

/* JADX INFO: loaded from: classes3.dex */
public class AlgoConstant {

    public interface DeviceType {
        public static final int JHM = 1;
        public static final int QL = 0;
    }

    public interface DiseaseResult {
        public static final int DISEASE_AFIB = 201;
        public static final int DISEASE_NORMAL = 200;
        public static final int DISEASE_PREMATURE = 202;
        public static final int DISEASE_REJECT = 203;
    }

    public interface MatchResult {
        public static final int BAD_DATA = 80;
        public static final int MATCH_FAIL = 82;
        public static final int MATCH_OK = 81;
    }

    public interface SignalQuality {
        public static final int GOOD = 8;
        public static final int POOR = 9;
    }
}

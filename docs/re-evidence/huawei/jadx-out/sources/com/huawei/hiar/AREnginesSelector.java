package com.huawei.hiar;

import android.content.Context;

/* JADX INFO: loaded from: classes33.dex */
@Deprecated
public class AREnginesSelector {
    private static final String LIBRARY_NAME = "huawei_arengine_jni";
    private static final String TAG = "AREnginesSelector";

    @Deprecated
    public enum AREnginesAvaliblity {
        UNKNOWN_AVALIBLITY(-1),
        HWAR_NONE_ENGINES_SUPPORTED(0),
        HWAR_ENGINE_SUPPORTED(1);

        final int nativeCode;

        public int getKeyValues() {
            return this.nativeCode;
        }

        static AREnginesAvaliblity forNumber(int i) {
            for (AREnginesAvaliblity aREnginesAvaliblity : values()) {
                if (aREnginesAvaliblity.nativeCode == i) {
                    return aREnginesAvaliblity;
                }
            }
            return UNKNOWN_AVALIBLITY;
        }

        AREnginesAvaliblity(int i) {
            this.nativeCode = i;
        }
    }

    @Deprecated
    public static AREnginesType setAREngine(AREnginesType aREnginesType) {
        return AREnginesType.forNumber(1);
    }

    @Deprecated
    public enum AREnginesType {
        UNKNOWN_TYPE(-1),
        HWAR_NONE(0),
        HWAR_ENGINE(1);

        final int nativeCode;

        static AREnginesType forNumber(int i) {
            for (AREnginesType aREnginesType : values()) {
                if (aREnginesType.nativeCode == i) {
                    return aREnginesType;
                }
            }
            return UNKNOWN_TYPE;
        }

        AREnginesType(int i) {
            this.nativeCode = i;
        }
    }

    @Deprecated
    public static AREnginesType getCreatedEngine() {
        return AREnginesType.forNumber(1);
    }

    @Deprecated
    public static AREnginesAvaliblity checkAllAvailableEngines(Context context) {
        return AREnginesAvaliblity.forNumber(1);
    }

    private AREnginesSelector() {
    }
}

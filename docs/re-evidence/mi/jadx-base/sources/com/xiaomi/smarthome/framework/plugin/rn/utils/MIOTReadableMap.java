package com.xiaomi.smarthome.framework.plugin.rn.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils;

/* JADX INFO: loaded from: classes2.dex */
public class MIOTReadableMap {
    private ReadableMap mReadableMap;

    /* JADX INFO: renamed from: com.xiaomi.smarthome.framework.plugin.rn.utils.MIOTReadableMap$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Map.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MIOTReadableMap(ReadableMap readableMap) {
        this.mReadableMap = readableMap;
    }

    public ReadableArray getArray(String str) {
        ReadableArray array;
        return (!this.mReadableMap.hasKey(str) || (array = this.mReadableMap.getArray(str)) == null) ? Arguments.createArray() : array;
    }

    public boolean getBoolean(String str, boolean z) {
        try {
            return this.mReadableMap.getBoolean(str);
        } catch (Exception unused) {
            return z;
        }
    }

    public double getDouble(String str, double d) {
        try {
            return this.mReadableMap.getDouble(str);
        } catch (Exception unused) {
            return d;
        }
    }

    public int getInt(String str, int i) {
        try {
            return this.mReadableMap.getInt(str);
        } catch (Exception unused) {
            return i;
        }
    }

    public String getString(String str, String str2) {
        ReadableMap readableMap = this.mReadableMap;
        if (readableMap != null && readableMap.hasKey(str)) {
            try {
                int i = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[this.mReadableMap.getType(str).ordinal()];
                if (i == 1) {
                    str2 = MIOTUtils.readableMapToJsonStr(this.mReadableMap.getMap(str));
                } else if (i == 3) {
                    str2 = this.mReadableMap.getArray(str).toString();
                } else if (i == 4) {
                    try {
                        str2 = this.mReadableMap.getDouble(str) + "";
                    } catch (Exception e) {
                        RnPluginLog.e(e.toString());
                        str2 = this.mReadableMap.getInt(str) + "";
                    }
                } else if (i == 5) {
                    str2 = this.mReadableMap.getString(str);
                } else if (i == 6) {
                    str2 = this.mReadableMap.getBoolean(str2) + "";
                }
            } catch (Exception e2) {
                RnPluginLog.e(e2.toString());
            }
        }
        return str2;
    }
}

package com.airoha.android.lib.transport.PacketParser;

import com.airoha.android.lib.transport.AirohaLink;
import com.airoha.android.lib.util.Converter;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RacePacketByH4Dispatcher {
    public static final byte RACE_BY_H4_START = 5;
    private static String e = "RacePacketByH4Dispatcher";
    private ConcurrentHashMap<String, OnRacePacketListener> a = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, OnRaceMmiPacketListener> b = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, OnRaceMmiRoleSwitchIndListener> c = new ConcurrentHashMap<>();
    private AirohaLink d;

    public RacePacketByH4Dispatcher(AirohaLink airohaLink) {
        this.d = airohaLink;
    }

    private static boolean a(byte[] bArr) {
        return bArr[1] == 93;
    }

    public static boolean isRaceResponse(byte[] bArr) {
        return bArr[1] == 91;
    }

    public static boolean isRackeByH4Collected(byte[] bArr) {
        return (bArr[0] & 5) == 5;
    }

    public void parseSend(byte[] bArr) {
        int iBytesToU16 = Converter.BytesToU16(bArr[5], bArr[4]);
        byte b = bArr[1];
        int iBytesToU17 = Converter.BytesToU16(bArr[3], bArr[2]) - 2;
        for (OnRacePacketListener onRacePacketListener : this.a.values()) {
            if (onRacePacketListener != null) {
                onRacePacketListener.handleRespOrInd(iBytesToU16, bArr, b);
            }
        }
        if (b == 91) {
            byte b2 = bArr[6];
            if (iBytesToU16 == 4608) {
                for (OnRaceMmiPacketListener onRaceMmiPacketListener : this.b.values()) {
                    if (onRaceMmiPacketListener != null) {
                        onRaceMmiPacketListener.OnAncSetOnResp(b2);
                    }
                }
            }
            if (iBytesToU16 == 4609) {
                for (OnRaceMmiPacketListener onRaceMmiPacketListener2 : this.b.values()) {
                    if (onRaceMmiPacketListener2 != null) {
                        onRaceMmiPacketListener2.OnAncSetOffResp(b2);
                    }
                }
            }
            if (iBytesToU16 == 4610) {
                for (OnRaceMmiPacketListener onRaceMmiPacketListener3 : this.b.values()) {
                    if (onRaceMmiPacketListener3 != null) {
                        onRaceMmiPacketListener3.OnAncGetStatusResp(b2);
                    }
                }
            }
            if (iBytesToU16 == 4611) {
                for (OnRaceMmiPacketListener onRaceMmiPacketListener4 : this.b.values()) {
                    if (onRaceMmiPacketListener4 != null) {
                        onRaceMmiPacketListener4.OnAncSetGainResp(b2);
                    }
                }
            }
            if (iBytesToU16 == 4612) {
                for (OnRaceMmiPacketListener onRaceMmiPacketListener5 : this.b.values()) {
                    if (onRaceMmiPacketListener5 != null) {
                        onRaceMmiPacketListener5.OnAncReadParamFromNvKeyResp(b2);
                    }
                }
            }
            if (iBytesToU16 == 4613) {
                for (OnRaceMmiPacketListener onRaceMmiPacketListener6 : this.b.values()) {
                    if (onRaceMmiPacketListener6 != null) {
                        onRaceMmiPacketListener6.OnAncWriteGainToNvKeyResp(b2);
                    }
                }
            }
        }
        if (b == 93) {
            if (iBytesToU16 == 4612) {
                byte[] bArr2 = new byte[iBytesToU17];
                System.arraycopy(bArr, 6, bArr2, 0, iBytesToU17);
                for (OnRaceMmiPacketListener onRaceMmiPacketListener7 : this.b.values()) {
                    if (onRaceMmiPacketListener7 != null) {
                        onRaceMmiPacketListener7.OnAncReadParamFromNvKeyInd(bArr2);
                    }
                }
            }
            if (iBytesToU16 == 3287) {
                byte b3 = bArr[6];
                for (OnRaceMmiRoleSwitchIndListener onRaceMmiRoleSwitchIndListener : this.c.values()) {
                    if (onRaceMmiRoleSwitchIndListener != null) {
                        onRaceMmiRoleSwitchIndListener.OnRoleSwitched(b3);
                    }
                }
            }
        }
    }

    public void registerRaceMmiPacketListener(String str, OnRaceMmiPacketListener onRaceMmiPacketListener) {
        this.b.put(str, onRaceMmiPacketListener);
    }

    public void registerRaceMmiRoleSwitchIndLisener(String str, OnRaceMmiRoleSwitchIndListener onRaceMmiRoleSwitchIndListener) {
        this.c.put(str, onRaceMmiRoleSwitchIndListener);
    }

    public void registerRacePacketListener(String str, OnRacePacketListener onRacePacketListener) {
        this.a.put(str, onRacePacketListener);
    }
}

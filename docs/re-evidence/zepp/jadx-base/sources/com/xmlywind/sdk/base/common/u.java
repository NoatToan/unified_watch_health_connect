package com.xmlywind.sdk.base.common;

import android.content.Context;
import com.google.android.material.timepicker.TimeModel;
import com.tencent.connect.common.Constants;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.SigMacroCommon;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;

/* JADX INFO: loaded from: classes22.dex */
class u implements o {
    private boolean b;
    private int c;
    private int a = 0;
    private String d = "";
    private int e = 0;

    /* JADX INFO: renamed from: com.xmlywind.sdk.base.common.u$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.values().length];
            a = iArr;
            try {
                iArr[a.AD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.AD_SKIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.AD_CLOSE_CARD_SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[a.AD_CLOSE_CARD_CLOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[a.AD_FOUR_ELEMENTS_SHOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[a.AD_FOUR_ELEMENTS_CLOSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[a.AD_SHOW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[a.AD_CLICK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[a.AD_COMPANION_CLICK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[a.AD_SHOW_SKIP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[a.AD_COMPLETE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[a.AD_REWARD.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[a.AD_FINISH.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[a.AD_VCLOSE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[a.AD_MUTE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[a.AD_UNMUTE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[a.AD_ROTATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[a.AD_VIDEO_START.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[a.AD_PLAY_QUARTER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[a.AD_PLAY_TWO_QUARTERS.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[a.AD_PLAY_THREE_QUARTERS.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[a.AD_PLAY_COMPLETE.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                a[a.AD_CLICK_SKIP.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(int i) {
        return i == 0 ? "0" : String.valueOf(i / 1000);
    }

    private void a(BaseAdUnit baseAdUnit, String str, int i) {
        a(baseAdUnit, str, i, null);
    }

    private void a(final BaseAdUnit baseAdUnit, final String str, final int i, String str2) {
        t.a(str, str2, baseAdUnit, new t.a() { // from class: com.xmlywind.sdk.base.common.u.1
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    PointEntitySigmob pointEntitySigmob = (PointEntitySigmob) obj;
                    u uVar = u.this;
                    pointEntitySigmob.setVtime(uVar.b(uVar.a));
                    u uVar2 = u.this;
                    pointEntitySigmob.setSkip_show_time(uVar2.b(uVar2.c));
                    pointEntitySigmob.setCurrent_time(u.this.b(i));
                    pointEntitySigmob.setPlay_process(String.valueOf((((double) i) * 1.0d) / ((double) u.this.b())));
                    if (str.equals("start")) {
                        pointEntitySigmob.setAd_scene(u.this.d);
                        pointEntitySigmob.setBid_token(baseAdUnit.getBid_token());
                    }
                    pointEntitySigmob.setPlay_time(u.this.a(i));
                    pointEntitySigmob.setSet_close_time(String.format(TimeModel.NUMBER_FORMAT, Integer.valueOf(u.this.e)));
                    pointEntitySigmob.setIs_truncation(u.this.a() ? "1" : "0");
                    pointEntitySigmob.setIs_force(u.this.b ? "1" : "0");
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a() {
        int i = this.e;
        return i > 0 && i * 1000 < this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        int i = this.e;
        return (i <= 0 || i * 1000 >= this.a) ? this.a : i * 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(int i) {
        return i == 0 ? "0" : String.format("%.2f", Float.valueOf(i / 1000.0f));
    }

    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(Context context, BaseAdUnit baseAdUnit, String str) {
        this.d = str;
        return true;
    }

    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(BaseAdUnit baseAdUnit) {
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, a.AD_CLOSE);
        a(baseAdUnit, PointCategory.ENDCARD, b(), "close");
        return true;
    }

    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(BaseAdUnit baseAdUnit, int i, int i2) {
        this.a = i;
        this.e = baseAdUnit.getEndTime();
        SigMacroCommon macroCommon = baseAdUnit.getMacroCommon();
        if (!(macroCommon instanceof SigMacroCommon)) {
            return true;
        }
        macroCommon.addMarcoKey(SigMacroCommon._VIDEOTIME_, a(this.a));
        return true;
    }

    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(BaseAdUnit baseAdUnit, a aVar, int i) {
        a aVar2;
        int iB = i;
        try {
            String str = "1";
            switch (AnonymousClass2.a[aVar.ordinal()]) {
                case 1:
                    a(baseAdUnit, "start", iB, null);
                    SigMacroCommon macroCommon = baseAdUnit.getMacroCommon();
                    if (macroCommon instanceof SigMacroCommon) {
                        macroCommon.addMarcoKey(SigMacroCommon._SETCLOSETIME_, String.valueOf(this.e));
                        macroCommon.addMarcoKey(SigMacroCommon._ENDTIME_, "0");
                        macroCommon.addMarcoKey(SigMacroCommon._VIDEOTIME_, a(this.a));
                        macroCommon.addMarcoKey(SigMacroCommon._COMPLETED_, "0");
                        macroCommon.addMarcoKey(SigMacroCommon._PLAYFIRSTFRAME_, "0");
                        if (!a()) {
                            str = "0";
                        }
                        macroCommon.addMarcoKey(SigMacroCommon._IS_TRUNCATION_, str);
                    }
                    aVar2 = a.AD_START;
                    break;
                case 2:
                    a(baseAdUnit, PointCategory.SKIP, iB);
                    SigMacroCommon macroCommon2 = baseAdUnit.getMacroCommon();
                    if (macroCommon2 instanceof SigMacroCommon) {
                        macroCommon2.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                        if (this.a <= 0 || iB <= 0) {
                            macroCommon2.addMarcoKey(SigMacroCommon._PROGRESS_, "0");
                        } else {
                            macroCommon2.addMarcoKey(SigMacroCommon._PROGRESS_, String.valueOf((iB * 100) / b()));
                        }
                    }
                    aVar2 = a.AD_SKIP;
                    break;
                case 3:
                    if (iB == 0) {
                        iB = b();
                    }
                    a(baseAdUnit, PointCategory.CLOSECARD, iB, "show");
                    return true;
                case 4:
                    if (iB == 0) {
                        iB = b();
                    }
                    a(baseAdUnit, PointCategory.CLOSECARD, iB, "close");
                    return true;
                case 5:
                    if (iB == 0) {
                        iB = b();
                    }
                    a(baseAdUnit, PointCategory.FOURELEMENTS, iB, "show");
                    return true;
                case 6:
                    if (iB == 0) {
                        iB = b();
                    }
                    a(baseAdUnit, PointCategory.FOURELEMENTS, iB, "close");
                    return true;
                case 7:
                    if (iB == 0) {
                        iB = b();
                    }
                    a aVar3 = a.AD_SHOW;
                    a(baseAdUnit, PointCategory.ENDCARD, iB, aVar3.a());
                    SigMacroCommon macroCommon3 = baseAdUnit.getMacroCommon();
                    if (macroCommon3 instanceof SigMacroCommon) {
                        macroCommon3.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                        if (this.a <= 0 || iB <= 0) {
                            macroCommon3.addMarcoKey(SigMacroCommon._PROGRESS_, "0");
                        } else {
                            macroCommon3.addMarcoKey(SigMacroCommon._PROGRESS_, String.valueOf((iB * 100) / b()));
                        }
                    }
                    com.xmlywind.sdk.base.a.c.a(baseAdUnit, aVar3);
                    return true;
                case 8:
                    aVar2 = a.AD_CLICK;
                    break;
                case 9:
                    if (iB == 0) {
                        iB = b();
                    }
                    SigMacroCommon macroCommon4 = baseAdUnit.getMacroCommon();
                    if (macroCommon4 instanceof SigMacroCommon) {
                        macroCommon4.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                        if (this.a <= 0 || iB <= 0) {
                            macroCommon4.addMarcoKey(SigMacroCommon._PROGRESS_, "0");
                        } else {
                            macroCommon4.addMarcoKey(SigMacroCommon._PROGRESS_, String.valueOf((iB * 100) / b()));
                        }
                    }
                    aVar2 = a.AD_COMPANION_CLICK;
                    break;
                case 10:
                    SigMacroCommon macroCommon5 = baseAdUnit.getMacroCommon();
                    if (macroCommon5 instanceof SigMacroCommon) {
                        macroCommon5.addMarcoKey(SigMacroCommon._SHOWSKIPTIME_, a(iB));
                        if (this.a <= 0 || iB <= 0) {
                            macroCommon5.addMarcoKey(SigMacroCommon._PROGRESS_, "0");
                        } else {
                            macroCommon5.addMarcoKey(SigMacroCommon._PROGRESS_, String.valueOf((iB * 100) / b()));
                        }
                        macroCommon5.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                        macroCommon5.addMarcoKey(SigMacroCommon._VIDEOTIME_, a(this.a));
                    }
                    aVar2 = a.AD_SHOW_SKIP;
                    break;
                case 11:
                    if (iB == 0) {
                        iB = b();
                    }
                    a(baseAdUnit, PointCategory.COMPLETE, iB);
                    SigMacroCommon macroCommon6 = baseAdUnit.getMacroCommon();
                    if (macroCommon6 instanceof SigMacroCommon) {
                        macroCommon6.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                        macroCommon6.addMarcoKey(SigMacroCommon._PROGRESS_, "100");
                    }
                    aVar2 = a.AD_COMPLETE;
                    break;
                case 12:
                case 13:
                    if (iB == 0) {
                        iB = b();
                    }
                    a(baseAdUnit, "finish", iB);
                    SigMacroCommon macroCommon7 = baseAdUnit.getMacroCommon();
                    if (macroCommon7 instanceof SigMacroCommon) {
                        if (this.a <= 0 || iB <= 0) {
                            macroCommon7.addMarcoKey(SigMacroCommon._PROGRESS_, "0");
                        } else {
                            macroCommon7.addMarcoKey(SigMacroCommon._PROGRESS_, String.valueOf((iB * 100) / b()));
                        }
                        macroCommon7.addMarcoKey(SigMacroCommon._COMPLETED_, "1");
                        macroCommon7.addMarcoKey(SigMacroCommon._PLAYLASTFRAME_, "1");
                        macroCommon7.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                    }
                    aVar2 = a.AD_FINISH;
                    break;
                case 14:
                    return true;
                case 15:
                    a(baseAdUnit, "silent", iB, "1");
                    return true;
                case 16:
                    a(baseAdUnit, "silent", iB, "0");
                    return true;
                case 17:
                    if (com.xmlywind.sdk.common.a.n() == null) {
                        return true;
                    }
                    a(baseAdUnit, PointCategory.SCREENSWITCH, iB, com.xmlywind.sdk.common.a.n().ak());
                    return true;
                case 18:
                    a(baseAdUnit, "play", iB, "0");
                    return true;
                case 19:
                    a(baseAdUnit, "play", iB, "0.25");
                    SigMacroCommon macroCommon8 = baseAdUnit.getMacroCommon();
                    if (macroCommon8 instanceof SigMacroCommon) {
                        macroCommon8.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                        macroCommon8.addMarcoKey(SigMacroCommon._PROGRESS_, Constants.VIA_REPORT_TYPE_CHAT_AUDIO);
                    }
                    aVar2 = a.AD_PLAY_QUARTER;
                    break;
                case 20:
                    a(baseAdUnit, "play", iB, "0.50");
                    SigMacroCommon macroCommon9 = baseAdUnit.getMacroCommon();
                    if (macroCommon9 instanceof SigMacroCommon) {
                        macroCommon9.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                        macroCommon9.addMarcoKey(SigMacroCommon._PROGRESS_, "50");
                    }
                    aVar2 = a.AD_PLAY_TWO_QUARTERS;
                    break;
                case 21:
                    a(baseAdUnit, "play", iB, "0.75");
                    SigMacroCommon macroCommon10 = baseAdUnit.getMacroCommon();
                    if (macroCommon10 instanceof SigMacroCommon) {
                        macroCommon10.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                        macroCommon10.addMarcoKey(SigMacroCommon._PROGRESS_, "75");
                    }
                    aVar2 = a.AD_PLAY_THREE_QUARTERS;
                    break;
                case 22:
                    a(baseAdUnit, "play", iB, "0.85");
                    SigMacroCommon macroCommon11 = baseAdUnit.getMacroCommon();
                    if (macroCommon11 instanceof SigMacroCommon) {
                        macroCommon11.addMarcoKey(SigMacroCommon._ENDTIME_, a(iB));
                        macroCommon11.addMarcoKey(SigMacroCommon._PROGRESS_, "85");
                    }
                    aVar2 = a.AD_PLAY_COMPLETE;
                    break;
                case 23:
                    a(baseAdUnit, aVar.a(), iB);
                    return true;
                default:
                    a(baseAdUnit, aVar.a(), iB);
                    com.xmlywind.sdk.base.a.c.a(baseAdUnit, aVar);
                    return true;
            }
            com.xmlywind.sdk.base.a.c.a(baseAdUnit, aVar2);
            return true;
        } catch (Throwable th) {
            SigmobLog.e("recordDisplayEvent ", th);
            return true;
        }
    }

    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(BaseAdUnit baseAdUnit, boolean z, int i) {
        this.b = z;
        this.c = i;
        return true;
    }
}

package com.xmlywind.sdk.nativead;

import android.content.Context;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.SigMacroCommon;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class d implements com.xmlywind.sdk.base.common.o {
    public Context a;

    /* JADX INFO: renamed from: com.xmlywind.sdk.nativead.d$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.xmlywind.sdk.base.common.a.values().length];
            a = iArr;
            try {
                iArr[com.xmlywind.sdk.base.common.a.AD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_NATIVE_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_HIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_VIDEO_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_RESTART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_PAUSE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_PLAY_QUARTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_PLAY_TWO_QUARTERS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_PLAY_THREE_QUARTERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_COMPLETE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_CLICK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_FOUR_ELEMENTS_SHOW.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[com.xmlywind.sdk.base.common.a.AD_FOUR_ELEMENTS_CLOSE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    private void a(BaseAdUnit baseAdUnit, String str, String str2, final HashMap<String, String> map) {
        com.xmlywind.sdk.base.common.t.a(str, str2, baseAdUnit, new com.xmlywind.sdk.base.common.t.a() { // from class: com.xmlywind.sdk.nativead.d.1
            @Override // com.xmlywind.sdk.base.common.t.a
            public void a(Object obj) {
                if (obj instanceof PointEntitySigmob) {
                    ((PointEntitySigmob) obj).setOptions(map);
                }
            }
        });
    }

    public boolean a(Context context, BaseAdUnit baseAdUnit) {
        this.a = context.getApplicationContext();
        return true;
    }

    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(Context context, BaseAdUnit baseAdUnit, String str) {
        return false;
    }

    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(BaseAdUnit baseAdUnit) {
        this.a = null;
        return true;
    }

    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(BaseAdUnit baseAdUnit, int i, int i2) {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(BaseAdUnit baseAdUnit, com.xmlywind.sdk.base.common.a aVar, int i) {
        String str;
        ?? r2;
        HashMap map;
        String str2;
        String str3;
        String str4;
        String str5;
        try {
            try {
                try {
                    switch (AnonymousClass2.a[aVar.ordinal()]) {
                        case 1:
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_START);
                            str = "start";
                            r2 = 0;
                            a(baseAdUnit, str, r2, r2);
                            break;
                        case 2:
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_NATIVE_SHOW);
                            str = PointCategory.AD_SHOW;
                            r2 = 0;
                            a(baseAdUnit, str, r2, r2);
                            break;
                        case 3:
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_HIDE);
                            str = PointCategory.AD_HIDE;
                            r2 = 0;
                            a(baseAdUnit, str, r2, r2);
                            break;
                        case 4:
                            SigMacroCommon macroCommon = baseAdUnit.getMacroCommon();
                            if (macroCommon instanceof SigMacroCommon) {
                                macroCommon.addMarcoKey(SigMacroCommon._VIDEOTIME_, String.valueOf(baseAdUnit.getVideoCommon().video_time));
                                macroCommon.addMarcoKey(SigMacroCommon._BEGINTIME_, String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                                macroCommon.addMarcoKey(SigMacroCommon._ENDTIME_, String.valueOf(baseAdUnit.getVideoCommon().end_time));
                                macroCommon.addMarcoKey(SigMacroCommon._PLAYFIRSTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_first));
                                macroCommon.addMarcoKey(SigMacroCommon._PLAYLASTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_last));
                                macroCommon.addMarcoKey(SigMacroCommon._SCENE_, String.valueOf(baseAdUnit.getVideoCommon().scene));
                                macroCommon.addMarcoKey(SigMacroCommon._TYPE_, String.valueOf(baseAdUnit.getVideoCommon().type));
                                macroCommon.addMarcoKey(SigMacroCommon._BEHAVIOR_, String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                                macroCommon.addMarcoKey(SigMacroCommon._STATUS_, String.valueOf(baseAdUnit.getVideoCommon().status));
                            }
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_VIDEO_LINK, true);
                            map = new HashMap();
                            map.put("video_time", String.valueOf(baseAdUnit.getVideoCommon().video_time));
                            map.put("begin_time", String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                            map.put("end_time", String.valueOf(baseAdUnit.getVideoCommon().end_time));
                            map.put("is_first", String.valueOf(baseAdUnit.getVideoCommon().is_first));
                            map.put("scene", String.valueOf(baseAdUnit.getVideoCommon().scene));
                            map.put("type", String.valueOf(baseAdUnit.getVideoCommon().type));
                            map.put("is_auto_play", String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                            map.put("status", String.valueOf(baseAdUnit.getVideoCommon().status));
                            str2 = PointCategory.VIDEO_LINK;
                            str3 = null;
                            a(baseAdUnit, str2, str3, map);
                            break;
                        case 5:
                            SigMacroCommon macroCommon2 = baseAdUnit.getMacroCommon();
                            if (macroCommon2 instanceof SigMacroCommon) {
                                macroCommon2.addMarcoKey(SigMacroCommon._VIDEOTIME_, String.valueOf(baseAdUnit.getVideoCommon().video_time));
                                macroCommon2.addMarcoKey(SigMacroCommon._BEGINTIME_, String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                                macroCommon2.addMarcoKey(SigMacroCommon._ENDTIME_, String.valueOf(baseAdUnit.getVideoCommon().end_time));
                                macroCommon2.addMarcoKey(SigMacroCommon._PLAYFIRSTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_first));
                                macroCommon2.addMarcoKey(SigMacroCommon._PLAYLASTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_last));
                                macroCommon2.addMarcoKey(SigMacroCommon._SCENE_, String.valueOf(baseAdUnit.getVideoCommon().scene));
                                macroCommon2.addMarcoKey(SigMacroCommon._TYPE_, String.valueOf(baseAdUnit.getVideoCommon().type));
                                macroCommon2.addMarcoKey(SigMacroCommon._BEHAVIOR_, String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                                macroCommon2.addMarcoKey(SigMacroCommon._STATUS_, String.valueOf(baseAdUnit.getVideoCommon().status));
                            }
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_RESTART);
                            map = new HashMap();
                            map.put("video_time", String.valueOf(baseAdUnit.getVideoCommon().video_time));
                            map.put("begin_time", String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                            map.put("end_time", String.valueOf(baseAdUnit.getVideoCommon().end_time));
                            map.put("is_first", String.valueOf(baseAdUnit.getVideoCommon().is_first));
                            map.put("scene", String.valueOf(baseAdUnit.getVideoCommon().scene));
                            map.put("type", String.valueOf(baseAdUnit.getVideoCommon().type));
                            map.put("is_auto_play", String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                            map.put("status", String.valueOf(baseAdUnit.getVideoCommon().status));
                            str2 = PointCategory.VIDEO_RESTART;
                            str3 = null;
                            a(baseAdUnit, str2, str3, map);
                            break;
                        case 6:
                            SigMacroCommon macroCommon3 = baseAdUnit.getMacroCommon();
                            if (macroCommon3 instanceof SigMacroCommon) {
                                macroCommon3.addMarcoKey(SigMacroCommon._VIDEOTIME_, String.valueOf(baseAdUnit.getVideoCommon().video_time));
                                macroCommon3.addMarcoKey(SigMacroCommon._BEGINTIME_, String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                                macroCommon3.addMarcoKey(SigMacroCommon._ENDTIME_, String.valueOf(baseAdUnit.getVideoCommon().end_time));
                                macroCommon3.addMarcoKey(SigMacroCommon._PLAYFIRSTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_first));
                                macroCommon3.addMarcoKey(SigMacroCommon._PLAYLASTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_last));
                                macroCommon3.addMarcoKey(SigMacroCommon._SCENE_, String.valueOf(baseAdUnit.getVideoCommon().scene));
                                macroCommon3.addMarcoKey(SigMacroCommon._TYPE_, String.valueOf(baseAdUnit.getVideoCommon().type));
                                macroCommon3.addMarcoKey(SigMacroCommon._BEHAVIOR_, String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                                macroCommon3.addMarcoKey(SigMacroCommon._STATUS_, String.valueOf(baseAdUnit.getVideoCommon().status));
                            }
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_START);
                            map = new HashMap();
                            map.put("video_time", String.valueOf(baseAdUnit.getVideoCommon().video_time));
                            map.put("begin_time", String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                            map.put("end_time", String.valueOf(baseAdUnit.getVideoCommon().end_time));
                            map.put("is_first", String.valueOf(baseAdUnit.getVideoCommon().is_first));
                            map.put("scene", String.valueOf(baseAdUnit.getVideoCommon().scene));
                            map.put("type", String.valueOf(baseAdUnit.getVideoCommon().type));
                            map.put("is_auto_play", String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                            map.put("status", String.valueOf(baseAdUnit.getVideoCommon().status));
                            str2 = PointCategory.VIDEO_START;
                            str3 = null;
                            a(baseAdUnit, str2, str3, map);
                            break;
                        case 7:
                            SigMacroCommon macroCommon4 = baseAdUnit.getMacroCommon();
                            if (macroCommon4 instanceof SigMacroCommon) {
                                macroCommon4.addMarcoKey(SigMacroCommon._VIDEOTIME_, String.valueOf(baseAdUnit.getVideoCommon().video_time));
                                macroCommon4.addMarcoKey(SigMacroCommon._BEGINTIME_, String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                                macroCommon4.addMarcoKey(SigMacroCommon._ENDTIME_, String.valueOf(baseAdUnit.getVideoCommon().end_time));
                                macroCommon4.addMarcoKey(SigMacroCommon._PLAYFIRSTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_first));
                                macroCommon4.addMarcoKey(SigMacroCommon._PLAYLASTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_last));
                                macroCommon4.addMarcoKey(SigMacroCommon._SCENE_, String.valueOf(baseAdUnit.getVideoCommon().scene));
                                macroCommon4.addMarcoKey(SigMacroCommon._TYPE_, String.valueOf(baseAdUnit.getVideoCommon().type));
                                macroCommon4.addMarcoKey(SigMacroCommon._BEHAVIOR_, String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                                macroCommon4.addMarcoKey(SigMacroCommon._STATUS_, String.valueOf(baseAdUnit.getVideoCommon().status));
                            }
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_PAUSE, true);
                            map = new HashMap();
                            map.put("video_time", String.valueOf(baseAdUnit.getVideoCommon().video_time));
                            map.put("begin_time", String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                            map.put("end_time", String.valueOf(baseAdUnit.getVideoCommon().end_time));
                            map.put("is_first", String.valueOf(baseAdUnit.getVideoCommon().is_first));
                            map.put("scene", String.valueOf(baseAdUnit.getVideoCommon().scene));
                            map.put("type", String.valueOf(baseAdUnit.getVideoCommon().type));
                            map.put("is_auto_play", String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                            map.put("status", String.valueOf(baseAdUnit.getVideoCommon().status));
                            str2 = PointCategory.VIDEO_PAUSE;
                            str3 = null;
                            a(baseAdUnit, str2, str3, map);
                            break;
                        case 8:
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_PLAY_QUARTER);
                            str4 = "0.25";
                            a(baseAdUnit, "play", str4, null);
                            break;
                        case 9:
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_PLAY_TWO_QUARTERS);
                            str4 = "0.50";
                            a(baseAdUnit, "play", str4, null);
                            break;
                        case 10:
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_PLAY_THREE_QUARTERS);
                            str4 = "0.75";
                            a(baseAdUnit, "play", str4, null);
                            break;
                        case 11:
                            SigMacroCommon macroCommon5 = baseAdUnit.getMacroCommon();
                            if (macroCommon5 instanceof SigMacroCommon) {
                                macroCommon5.addMarcoKey(SigMacroCommon._VIDEOTIME_, String.valueOf(baseAdUnit.getVideoCommon().video_time));
                                macroCommon5.addMarcoKey(SigMacroCommon._BEGINTIME_, String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                                macroCommon5.addMarcoKey(SigMacroCommon._ENDTIME_, String.valueOf(baseAdUnit.getVideoCommon().end_time));
                                macroCommon5.addMarcoKey(SigMacroCommon._PLAYFIRSTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_first));
                                macroCommon5.addMarcoKey(SigMacroCommon._PLAYLASTFRAME_, String.valueOf(baseAdUnit.getVideoCommon().is_last));
                                macroCommon5.addMarcoKey(SigMacroCommon._SCENE_, String.valueOf(baseAdUnit.getVideoCommon().scene));
                                macroCommon5.addMarcoKey(SigMacroCommon._TYPE_, String.valueOf(baseAdUnit.getVideoCommon().type));
                                macroCommon5.addMarcoKey(SigMacroCommon._BEHAVIOR_, String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                                macroCommon5.addMarcoKey(SigMacroCommon._STATUS_, String.valueOf(baseAdUnit.getVideoCommon().status));
                            }
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_COMPLETE, true);
                            HashMap map2 = new HashMap();
                            map2.put("video_time", String.valueOf(baseAdUnit.getVideoCommon().video_time));
                            map2.put("begin_time", String.valueOf(baseAdUnit.getVideoCommon().begin_time));
                            map2.put("end_time", String.valueOf(baseAdUnit.getVideoCommon().end_time));
                            map2.put("is_first", String.valueOf(baseAdUnit.getVideoCommon().is_first));
                            map2.put("scene", String.valueOf(baseAdUnit.getVideoCommon().scene));
                            map2.put("type", String.valueOf(baseAdUnit.getVideoCommon().type));
                            map2.put("is_auto_play", String.valueOf(baseAdUnit.getVideoCommon().is_auto_play));
                            map2.put("status", String.valueOf(baseAdUnit.getVideoCommon().status));
                            a(baseAdUnit, PointCategory.COMPLETE, null, map2);
                            break;
                        case 12:
                            String str6 = baseAdUnit.getClickCommon().is_final_click ? "1" : "0";
                            SigMacroCommon macroCommon6 = baseAdUnit.getMacroCommon();
                            if (macroCommon6 instanceof SigMacroCommon) {
                                macroCommon6.addMarcoKey(SigMacroCommon._CLICKAREA_, String.valueOf(baseAdUnit.getClickCommon().click_area));
                                macroCommon6.addMarcoKey(SigMacroCommon._CLICKSCENE_, String.valueOf(baseAdUnit.getClickCommon().click_scene));
                                macroCommon6.addMarcoKey(SigMacroCommon._AUTOCLICK_, String.valueOf(baseAdUnit.getClickCommon().auto_click));
                                macroCommon6.addMarcoKey(SigMacroCommon._FINALCLICK_, str6);
                                macroCommon6.addMarcoKey(SigMacroCommon._DOWNX_, String.valueOf(baseAdUnit.getClickCommon().down.a()));
                                macroCommon6.addMarcoKey(SigMacroCommon._DOWNY_, String.valueOf(baseAdUnit.getClickCommon().down.b()));
                                macroCommon6.addMarcoKey(SigMacroCommon._UPX_, String.valueOf(baseAdUnit.getClickCommon().up.b()));
                                macroCommon6.addMarcoKey(SigMacroCommon._UPY_, String.valueOf(baseAdUnit.getClickCommon().up.b()));
                            }
                            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_CLICK);
                            HashMap map3 = new HashMap();
                            map3.put("click_area", baseAdUnit.getClickCommon().click_area);
                            map3.put("click_scene", baseAdUnit.getClickCommon().click_scene);
                            map3.put("is_final_click", str6);
                            map3.put("coordinate", baseAdUnit.getClickCommon().getClickCoordinate());
                            a(baseAdUnit, baseAdUnit.getClickCommon().click_scene, "click", map3);
                            break;
                        case 13:
                            str5 = "show";
                            a(baseAdUnit, PointCategory.FOURELEMENTS, str5, null);
                            break;
                        case 14:
                            str5 = "close";
                            a(baseAdUnit, PointCategory.FOURELEMENTS, str5, null);
                            break;
                        default:
                            break;
                    }
                    return true;
                } catch (Throwable unused) {
                    return true;
                }
            } catch (Throwable unused2) {
                return true;
            }
        } catch (Throwable unused3) {
        }
    }

    @Override // com.xmlywind.sdk.base.common.o
    public boolean a(BaseAdUnit baseAdUnit, boolean z, int i) {
        return false;
    }
}

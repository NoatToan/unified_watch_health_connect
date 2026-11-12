package com.huami.watch.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.sdk.m.c.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class OsUtil {
    private static final String a = "ro.build.display.id";
    private static final String b = "ro.build.version.base_os";
    private static final String c = "ro.com.google.clientidbase";
    private static final String d = "ro.build.user";

    private static boolean a(Context context, @NonNull List<String> list) {
        Iterator<String> it2 = list.iterator();
        boolean zC = false;
        while (!zC && it2.hasNext()) {
            zC = c(context, it2.next());
        }
        return zC;
    }

    private static boolean b(String str, @NonNull List<String> list) {
        Iterator<String> it2 = list.iterator();
        boolean zContains = false;
        while (!zContains && it2.hasNext()) {
            zContains = str.toLowerCase().contains(it2.next().toLowerCase());
        }
        return zContains;
    }

    private static boolean c(Context context, String str) {
        return !TextUtils.isEmpty(DeviceCompatibility.a(context, str));
    }

    public static ROM getOs(Context context) {
        ROM rom = ROM.OTHER;
        ROM rom2 = ROM.MIUI;
        if (!a(context, rom2.keys)) {
            ROM rom3 = ROM.EMUI;
            if (!a(context, rom3.keys)) {
                rom3 = ROM.Flyme;
                if (!a(context, rom3.keys)) {
                    ROM rom4 = ROM.ColorOS;
                    if (!a(context, rom4.keys)) {
                        ROM rom5 = ROM.FuntouchOS;
                        if (!a(context, rom5.keys)) {
                            ROM rom6 = ROM.EUI;
                            if (!a(context, rom6.keys)) {
                                rom6 = ROM.AmigoOS;
                                if (!a(context, rom6.keys)) {
                                    ROM rom7 = ROM.Sony;
                                    if (!a(context, rom7.keys)) {
                                        ROM rom8 = ROM.YuLong;
                                        if (!a(context, rom8.keys)) {
                                            ROM rom9 = ROM.Sense;
                                            if (!a(context, rom9.keys)) {
                                                ROM rom10 = ROM.LG;
                                                if (!a(context, rom10.keys)) {
                                                    rom10 = ROM.LENOVO;
                                                    if (!a(context, rom10.keys)) {
                                                        ROM rom11 = ROM.YUNOS;
                                                        if (!a(context, rom11.keys)) {
                                                            rom11 = ROM.SmartisanOS;
                                                            if (!a(context, rom11.keys)) {
                                                                if (c(context, a)) {
                                                                    String strA = DeviceCompatibility.a(context, a);
                                                                    if (!b(strA, rom3.names)) {
                                                                        if (!b(strA, rom6.names)) {
                                                                            return rom;
                                                                        }
                                                                    }
                                                                } else if (c(context, b)) {
                                                                    String strA2 = DeviceCompatibility.a(context, b);
                                                                    if (!b(strA2, rom4.names)) {
                                                                        rom2 = ROM.Samsumg;
                                                                        if (!b(strA2, rom2.names)) {
                                                                            return rom;
                                                                        }
                                                                    }
                                                                } else if (c(context, c)) {
                                                                    String strA3 = DeviceCompatibility.a(context, c);
                                                                    if (!b(strA3, rom2.names)) {
                                                                        if (!b(strA3, rom4.names)) {
                                                                            if (!b(strA3, rom5.names)) {
                                                                                rom2 = ROM.Samsumg;
                                                                                if (!b(strA3, rom2.names)) {
                                                                                    if (!b(strA3, rom7.names)) {
                                                                                        if (!b(strA3, rom8.names)) {
                                                                                            if (!b(strA3, rom9.names)) {
                                                                                                if (!b(strA3, rom10.names)) {
                                                                                                    if (!b(strA3, rom6.names)) {
                                                                                                        return rom;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (!c(context, d)) {
                                                                        return rom;
                                                                    }
                                                                    String strA4 = DeviceCompatibility.a(context, d);
                                                                    rom2 = ROM.MiFavor;
                                                                    if (!b(strA4, rom2.names)) {
                                                                        rom2 = ROM.Nubia;
                                                                        if (!b(strA4, rom2.names)) {
                                                                            return rom;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        return rom11;
                                                    }
                                                }
                                                return rom10;
                                            }
                                            return rom9;
                                        }
                                        return rom8;
                                    }
                                    return rom7;
                                }
                            }
                            return rom6;
                        }
                        return rom5;
                    }
                    return rom4;
                }
            }
            return rom3;
        }
        return rom2;
    }

    public enum ROM {
        MIUI(Arrays.asList("ro.miui.ui.version.name", "ro.miui.ui.version.code"), "xiaomi"),
        EMUI(Arrays.asList(a.a, "ro.build.hw_emui_api_level", "ro.confg.hw_systemversion")),
        Flyme(Arrays.asList("ro.flyme.published", "ro.meizu.setupwizard.flyme"), "flyme"),
        ColorOS(Arrays.asList("ro.oppo.theme.version", "ro.oppo.version", "ro.rom.different.version"), "oppo"),
        FuntouchOS(Arrays.asList("ro.vivo.os.name", "ro.vivo.os.version", "ro.vivo.os.build.display.id"), "vivo"),
        EUI(Arrays.asList("ro.letv.release.version", "ro.product.letv_name", "ro.product.letv_model")),
        AmigoOS(Arrays.asList("ro.gn.gnromvernumber", "ro.gn.amigo.systemui.support"), "amigo", "gionee"),
        Sony(Arrays.asList("ro.sony.irremote.protocol_type", "ro.sony.fota.encrypteddata"), "sony"),
        YuLong(Arrays.asList("ro.yulong.version.release", "ro.yulong.version.tag"), "coolpad"),
        Sense(Arrays.asList("htc.build.stage", "ro.htc.bluetooth.sap"), "htc"),
        LG(Arrays.asList("ro.lge.swversion", "ro.lge.swversion_short", "ro.lge.factoryversion")),
        LENOVO(Arrays.asList("ro.lenovo.device", "ro.lenovo.platform", "ro.lenovo.adb"), "lenovo"),
        YUNOS(Collections.singletonList("ro.yunos.version"), "yunos"),
        SmartisanOS(Collections.singletonList("ro.smartisan.version"), "smartisan"),
        MiFavor(Collections.emptyList(), "zte"),
        Nubia(Collections.emptyList(), "nubia"),
        Samsumg(Collections.emptyList(), "samsung"),
        OTHER;

        private List<String> keys;
        private List<String> names;

        ROM() {
            this.keys = new ArrayList();
            this.names = new ArrayList();
        }

        ROM(List list) {
            this.keys = new ArrayList();
            this.names = new ArrayList();
            this.keys = list;
        }

        ROM(List list, String... strArr) {
            this.keys = new ArrayList();
            this.names = new ArrayList();
            this.keys = list;
            this.names = Arrays.asList(strArr);
        }
    }
}

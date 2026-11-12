package com.huawei.hms.ads.uiengineloader;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.huawei.hms.ads.dynamic.IDynamicLoader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f12931a = "ads_HMSLoadStrategy";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f12932b = "content://com.huawei.hms";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f12933c = "huawei_module_dynamicloader";
    private static final String d = "errcode";
    private static final String e = "loader_version";
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 6;
    private static HashMap<String, Bundle> i = new HashMap<>();

    @Override // com.huawei.hms.ads.uiengineloader.u
    public final y a(Context context, String str, String str2) throws com.huawei.hms.ads.dynamicloader.j {
        return b(context, str);
    }

    @Override // com.huawei.hms.ads.uiengineloader.u
    public final Context a(Context context, y yVar) throws com.huawei.hms.ads.dynamicloader.j {
        try {
            if (yVar.e.contains("huawei_module_dynamicloader")) {
                Bundle bundle = new Bundle();
                bundle.putString("module_path", yVar.f12952b);
                bundle.putString("module_name", yVar.f12951a);
                bundle.putInt("armeabiType", yVar.h);
                bundle.putString("loader_version_type", yVar.f);
                com.huawei.hms.ads.dynamicloader.h.a(context);
                return com.huawei.hms.ads.dynamicloader.h.a(context, bundle);
            }
            af.b(f12931a, "The loader is not dynamicLoader，use it to load.");
            IDynamicLoader iDynamicLoaderAsInterface = IDynamicLoader.Stub.asInterface(w.a(context, yVar.e));
            if (iDynamicLoaderAsInterface == null) {
                af.c(f12931a, "Get iDynamicLoader failed: null.");
                return null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("module_name", yVar.f12951a);
            bundle2.putString("loader_path", yVar.e);
            bundle2.putInt("module_version", yVar.d);
            bundle2.putString("loader_version_type", yVar.f);
            return w.a(context, yVar.f12951a, bundle2, iDynamicLoaderAsInterface);
        } catch (com.huawei.hms.ads.dynamicloader.j e2) {
            throw e2;
        } catch (Exception unused) {
            af.d(f12931a, "Load DynamicModule failed.");
            Bundle bundle3 = new Bundle();
            bundle3.putInt("errcode", 6);
            throw new com.huawei.hms.ads.dynamicloader.j("load HMS dynamic module failed.", bundle3);
        }
    }

    private static void e(Context context, String str) {
        StringBuilder sb;
        String string;
        try {
            Bundle bundleC = c(context, str);
            if (bundleC == null) {
                string = "query failed to get bundle info: null.";
            } else {
                int i2 = bundleC.getInt("errcode");
                if (i2 == 1) {
                    sb = new StringBuilder("the query module:");
                    sb.append(str);
                    sb.append(" is not existed in HMS.");
                } else {
                    if (i2 == 0) {
                        af.b(f12931a, "Ready to cp module.");
                        boolean zA = x.a(context, bundleC);
                        af.a(f12931a, "bundle info: errorCode:" + i2 + ", moduleName:" + str + ", moduleVersion:" + bundleC.getInt("module_version"));
                        StringBuilder sb2 = new StringBuilder("cp remote version by module name:");
                        sb2.append(str);
                        sb2.append(" ,result:");
                        sb2.append(zA);
                        af.b(f12931a, sb2.toString());
                        return;
                    }
                    sb = new StringBuilder("failed to get bundle info for ");
                    sb.append(str);
                    sb.append(", errcode:");
                    sb.append(i2);
                }
                string = sb.toString();
            }
            af.c(f12931a, string);
        } catch (Throwable th) {
            af.c(f12931a, "Failed to cp remote hms module version." + th.getClass().getSimpleName());
        }
    }

    private static void d(Context context, String str) {
        new AnonymousClass1(context, str).start();
    }

    private static Bundle c(Context context, String str) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            if (contentResolver == null) {
                af.c(f12931a, "Query remote version failed: null contentResolver.");
                return null;
            }
            Bundle bundleCall = contentResolver.call(Uri.parse("content://com.huawei.hms"), str, (String) null, (Bundle) null);
            if (bundleCall == null) {
                af.c(f12931a, "query module:" + str + " failed: null.");
                return null;
            }
            int i2 = bundleCall.getInt("errcode");
            if (i2 == 0) {
                i.put(str, bundleCall);
            }
            af.b(f12931a, "Query module info result code:".concat(String.valueOf(i2)));
            return bundleCall;
        } catch (Exception e2) {
            af.c(f12931a, "Query module:" + str + " info failed:" + e2.getMessage());
            return null;
        }
    }

    private static y b(Context context, String str) throws com.huawei.hms.ads.dynamicloader.j {
        String str2;
        y yVar = new y();
        try {
            Bundle bundleC = c(context, str);
            if (bundleC == null) {
                str2 = "Failed to get bundle info: null.";
            } else {
                int i2 = bundleC.getInt("errcode");
                if (i2 != 1) {
                    if (i2 != 0) {
                        af.c(f12931a, "Failed to get bundle info for " + str + ", errcode:" + i2);
                        throw new com.huawei.hms.ads.dynamicloader.j("Query module unavailable, maybe you need to download it.", bundleC);
                    }
                    yVar.f12951a = str;
                    yVar.f12952b = bundleC.getString("module_path");
                    yVar.f12953c = bundleC.getString(com.huawei.hms.ads.dynamicloader.b.k);
                    yVar.d = bundleC.getInt("module_version");
                    yVar.e = bundleC.getString("loader_path");
                    yVar.g = bundleC.getInt("loader_version");
                    yVar.h = bundleC.getInt("armeabiType");
                    af.b(f12931a, "bundle info: errorCode:" + i2 + ", moduleName:" + str + ", moduleVersion:" + yVar.d);
                    try {
                        if (Build.VERSION.SDK_INT >= 31) {
                            boolean zA = x.a(context, bundleC);
                            af.b(f12931a, "android s,  result:".concat(String.valueOf(zA)));
                            if (zA) {
                                yVar.f12952b = bundleC.getString("module_path");
                            }
                        } else {
                            new AnonymousClass1(context, yVar.f12951a).start();
                        }
                    } catch (Throwable th) {
                        af.c(f12931a, "copyRemoteModule err:" + th.getClass().getSimpleName());
                    }
                    af.b(f12931a, "Query remote version by module name:" + str + " success.");
                    return yVar;
                }
                str2 = "The query module:" + str + " is not existed in HMS.";
            }
            af.c(f12931a, str2);
            return yVar;
        } catch (com.huawei.hms.ads.dynamicloader.j e2) {
            throw e2;
        } catch (Exception e3) {
            af.c(f12931a, "Failed to Query remote module version." + e3.getClass().getSimpleName());
        }
    }

    private static Context b(Context context, y yVar) throws com.huawei.hms.ads.dynamicloader.j {
        IDynamicLoader iDynamicLoaderAsInterface = IDynamicLoader.Stub.asInterface(w.a(context, yVar.e));
        if (iDynamicLoaderAsInterface == null) {
            af.c(f12931a, "Get iDynamicLoader failed: null.");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("module_name", yVar.f12951a);
        bundle.putString("loader_path", yVar.e);
        bundle.putInt("module_version", yVar.d);
        bundle.putString("loader_version_type", yVar.f);
        return w.a(context, yVar.f12951a, bundle, iDynamicLoaderAsInterface);
    }

    public static void a(Context context, String str, int i2) {
        StringBuilder sb;
        String string;
        try {
            int iA = a(context, str);
            af.b(f12931a, "remoteVersion:" + iA + " localModuleVersion:" + i2);
            if (iA > i2) {
                try {
                    Bundle bundleC = c(context, str);
                    if (bundleC == null) {
                        string = "query failed to get bundle info: null.";
                    } else {
                        int i3 = bundleC.getInt("errcode");
                        if (i3 == 1) {
                            sb = new StringBuilder("the query module:");
                            sb.append(str);
                            sb.append(" is not existed in HMS.");
                        } else {
                            if (i3 == 0) {
                                af.b(f12931a, "Ready to cp module.");
                                boolean zA = x.a(context, bundleC);
                                af.a(f12931a, "bundle info: errorCode:" + i3 + ", moduleName:" + str + ", moduleVersion:" + bundleC.getInt("module_version"));
                                StringBuilder sb2 = new StringBuilder("cp remote version by module name:");
                                sb2.append(str);
                                sb2.append(" ,result:");
                                sb2.append(zA);
                                af.b(f12931a, sb2.toString());
                                return;
                            }
                            sb = new StringBuilder("failed to get bundle info for ");
                            sb.append(str);
                            sb.append(", errcode:");
                            sb.append(i3);
                        }
                        string = sb.toString();
                    }
                    af.c(f12931a, string);
                } catch (Throwable th) {
                    af.c(f12931a, "Failed to cp remote hms module version." + th.getClass().getSimpleName());
                }
            }
        } catch (Throwable th2) {
            af.c(f12931a, "cp error: " + th2.getLocalizedMessage());
        }
    }

    private static void a(Context context, y yVar, Bundle bundle) {
        try {
            if (Build.VERSION.SDK_INT < 31) {
                new AnonymousClass1(context, yVar.f12951a).start();
                return;
            }
            boolean zA = x.a(context, bundle);
            af.b(f12931a, "android s,  result:".concat(String.valueOf(zA)));
            if (zA) {
                yVar.f12952b = bundle.getString("module_path");
            }
        } catch (Throwable th) {
            af.c(f12931a, "copyRemoteModule err:" + th.getClass().getSimpleName());
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.ads.uiengineloader.t$1, reason: invalid class name */
    final class AnonymousClass1 extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f12934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f12936c = 0;

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            t.a(this.f12934a, this.f12935b, this.f12936c);
        }

        AnonymousClass1(Context context, String str) {
            this.f12934a = context;
            this.f12935b = str;
        }
    }

    public static int a(Context context, String str) throws com.huawei.hms.ads.dynamicloader.j {
        Bundle bundle;
        if (i.containsKey(str) && (bundle = i.get(str)) != null) {
            af.b(f12931a, "cachedModuleInfo containsKey, version: " + bundle.getInt("module_version"));
            return bundle.getInt("module_version");
        }
        Bundle bundleC = c(context, str);
        if (bundleC == null) {
            af.c(f12931a, "Query module bundle info failed: null.");
            return 0;
        }
        if (bundleC.getInt("errcode") != 0) {
            return 0;
        }
        return bundleC.getInt("module_version");
    }
}

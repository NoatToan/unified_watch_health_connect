package com.huami.watch.crashmonitor;

import android.content.Context;
import android.os.DropBoxManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import clc.utils.debug.slog.SolidLogger;
import clc.utils.taskmanager.Task;
import clc.utils.taskmanager.TaskManager;
import clc.utils.taskmanager.TaskOperation;
import com.huami.watch.transport.httpsupport.GlobalDefine;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.huami.watch.transport.httpsupport.control.service.HttpTransportManager;
import com.huami.watch.transport.httpsupport.model.DataItem;
import com.huami.watch.transport.httpsupport.model.DataUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class SystemMonitor {
    public static final int MAX_LEN_LIMIT_SINGLE_MSG_TO_POST = 1000;
    public static final String MONITOR_ACTION = "crash_pump";
    private static JSONObject a = null;
    private static final int e = 3;
    private static WeakReference<Method> g;
    public static final String HM_HOST_CRASH = Config.getUrlDropBoxCrash();
    private static TaskManager h = new TaskManager("hm-sys-crash-monitor");
    private static String b = "chain";
    private static String c = "node";
    private static final Object d = new Object();
    private static WeakReference<Class> f = null;

    public static final class a extends Task {
        public final /* synthetic */ Context f;
        public final /* synthetic */ DataItem g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Task.RunningStatus runningStatus, DataItem dataItem, Context context) {
            super(runningStatus);
            this.g = dataItem;
            this.f = context;
        }

        @Override // clc.utils.taskmanager.Task
        public TaskOperation onExecute(TaskOperation taskOperation) {
            this.g.setState(1);
            DataCacher.getInstance(this.f).save(this.g);
            boolean z = GlobalDefine.DEBUG_CRASH_MONITOR;
            if (z) {
                Log.i(GlobalDefine.TAG_CRASH, "====[生成一个item]=====>" + this.g.getIdentifier());
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "====[生成一个item]=====>" + this.g.getIdentifier());
            if (!(Settings.System.getInt(this.f.getContentResolver(), "com.huami.watch.extra.DEVICE_CONNECTION_STATUS", 0) > 0 || Settings.System.getInt(this.f.getContentResolver(), "com.huami.watch.extra.conn.ctrl", 0) > 0)) {
                if (z) {
                    Log.i(GlobalDefine.TAG_CRASH, "====[不触发上传缓存]===== 因为'手表未连接'");
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "====[不触发上传缓存]===== 因为'手表未连接'");
                return null;
            }
            List<DataItem> listQuery = DataCacher.getInstance(this.f).query(1);
            if (listQuery != null) {
                if (z) {
                    Log.i(GlobalDefine.TAG_CRASH, "====[目前缓存的总个数]===== " + listQuery.size());
                }
                SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "====[目前缓存的总个数]===== " + listQuery.size());
                if (listQuery.size() > 1) {
                    if (z) {
                        Log.i(GlobalDefine.TAG_CRASH, "====[触发上传缓存]=====");
                    }
                    SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "====[触发上传缓存]=====");
                    HttpTransportManager.getInstance(this.f).tryProcessCachedRequestWhilePhoneAvalible(this.f);
                }
            }
            return null;
        }
    }

    private static void a() {
        synchronized (d) {
            if (a != null) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            a = jSONObject;
            try {
                jSONObject.put(b, new JSONArray());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static DataItem b(Context context, JSONArray jSONArray, boolean z) {
        if ((jSONArray == null || jSONArray.length() <= 3) && !z) {
            return null;
        }
        DataItem dataItem = new DataItem();
        dataItem.addFlags(128);
        dataItem.addFlags(2);
        dataItem.addFlags(16);
        dataItem.addFlags(4096);
        dataItem.setOwner(context.getPackageName());
        dataItem.setUrl(HM_HOST_CRASH);
        dataItem.setState(1);
        dataItem.setAction(MONITOR_ACTION);
        JSONObject jSONObject = new JSONObject();
        try {
            c();
            jSONObject.put("details", "");
            jSONObject.put("mobileDeviceId", g.get().invoke(null, "ro.sn.serial_numbers"));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        dataItem.addExtraPair(DataUtils.DataItemKey.EXTRA.KEY_EXTRA_EXTENSION_SLOT_FRAME, jSONObject.toString());
        dataItem.addExtraPair(DataUtils.DataItemKey.EXTRA.KEY_EXTRA_EXTENSION_SLOT_POINT, "details");
        dataItem.setData(new String(a.toString()));
        dataItem.setMethod(DataItem.HTTP_METHOD_POST);
        dataItem.setIdentifier(DataUtils.generateId());
        a = null;
        return dataItem;
    }

    private static void c() {
        try {
            WeakReference<Class> weakReference = f;
            if (weakReference == null || g == null || weakReference.get() == null || g.get() == null) {
                f = new WeakReference<>(Class.forName("android.os.SystemProperties"));
                WeakReference<Method> weakReference2 = new WeakReference<>(f.get().getDeclaredMethod("get", String.class));
                g = weakReference2;
                if (weakReference2.get().isAccessible()) {
                    return;
                }
                g.get().setAccessible(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private static void d(Context context, DataItem dataItem) {
        if (dataItem != null) {
            h.next(new a(Task.RunningStatus.WORK_THREAD, dataItem, context)).execute();
        }
    }

    public static void forceUpload(Context context) {
        synchronized (SystemMonitor.class) {
            if (GlobalDefine.DEBUG_CRASH_MONITOR) {
                Log.i(GlobalDefine.TAG_CRASH, "=======强制上传crash log =====>");
            }
            SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "=======强制上传crash log =====>");
            a();
            d(context, b(context, null, true));
        }
    }

    public static void inject(Context context, String str, long j) {
        synchronized (SystemMonitor.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    boolean z = GlobalDefine.DEBUG_CRASH_MONITOR;
                    if (z) {
                        Log.i(GlobalDefine.TAG_CRASH, "====注入 crash =====>");
                    }
                    if (z) {
                        SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "====注入 错误 =====>");
                    }
                    DropBoxManager.Entry nextEntry = ((DropBoxManager) context.getSystemService("dropbox")).getNextEntry(str, j - 1);
                    if (nextEntry == null) {
                        return;
                    }
                    String text = nextEntry.getText(1000);
                    if (TextUtils.isEmpty(text)) {
                        if (z) {
                            Log.i(GlobalDefine.TAG_CRASH, "====message 是空的长度 忽略这次注入=====>");
                        }
                        SolidLogger.getInstance().with(GlobalDefine.TAG_CRASH, "====message 是空的长度 忽略这次注入=====>");
                        return;
                    }
                    a();
                    synchronized (d) {
                        JSONArray jSONArrayOptJSONArray = a.optJSONArray(b);
                        if (jSONArrayOptJSONArray != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(c, text);
                                jSONArrayOptJSONArray.put(jSONObject);
                            } catch (JSONException unused) {
                            }
                            d(context, b(context, jSONArrayOptJSONArray, false));
                        }
                    }
                }
            }
        }
    }
}

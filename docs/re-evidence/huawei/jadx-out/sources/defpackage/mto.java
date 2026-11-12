package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.provider.ContactsContract;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ContentObserver f42406a;
    private static ContentResolver e;

    public static boolean a(Context context, int i) {
        List<JobInfo> allPendingJobs;
        if (context == null) {
            LogUtil.j("ContactsListenUtils", "isJobIdRunning: context is null");
            return false;
        }
        Object systemService = context.getSystemService("jobscheduler");
        JobScheduler jobScheduler = systemService instanceof JobScheduler ? (JobScheduler) systemService : null;
        if (jobScheduler != null && (allPendingJobs = jobScheduler.getAllPendingJobs()) != null) {
            Iterator<JobInfo> it = allPendingJobs.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void e(Context context, Class<? extends JobService> cls) {
        LogUtil.a("startListen: start", new Object[0]);
        if (context == null || cls == null) {
            LogUtil.j("ContactsListenUtils", "startListen: failure, parameter is null");
        } else {
            a(context, cls);
        }
    }

    public static void c(ContentResolver contentResolver, ContentObserver contentObserver) {
        if (contentResolver == null || contentObserver == null) {
            LogUtil.j("ContactsListenUtils", "startListen: failure, parameter is null");
        } else {
            d(contentResolver, contentObserver);
        }
    }

    public static void e(Context context) {
        ContentObserver contentObserver;
        LogUtil.a("ContactsListenUtils", "stopListen: start");
        if (context == null) {
            LogUtil.j("ContactsListenUtils", "stopListen: context is null.");
            return;
        }
        if (mtk.e()) {
            Object systemService = context.getSystemService("jobscheduler");
            if (!(systemService instanceof JobScheduler)) {
                LogUtil.j("ContactsListenUtils", "stopListen: service is not type of JobService.");
                return;
            }
            ((JobScheduler) systemService).cancel(65281);
        } else {
            ContentResolver contentResolver = e;
            if (contentResolver == null || (contentObserver = f42406a) == null) {
                LogUtil.j("ContactsListenUtils", "stopListen: sContactsResolver or sContactsObserver is null.");
                return;
            }
            contentResolver.unregisterContentObserver(contentObserver);
        }
        msc.c().d();
    }

    private static void a(Context context, Class<? extends JobService> cls) {
        LogUtil.a("ContactsListenUtils", "listenContactsOnApi24OrLater: start");
        Object systemService = context.getSystemService("jobscheduler");
        if (!(systemService instanceof JobScheduler)) {
            LogUtil.j("ContactsListenUtils", "listenContactsOnApi24OrLater: service is not the type of JobScheduler");
            return;
        }
        JobInfo.TriggerContentUri triggerContentUri = new JobInfo.TriggerContentUri(ContactsContract.RawContacts.CONTENT_URI, 1);
        JobInfo.Builder builder = new JobInfo.Builder(65281, new ComponentName(context, cls));
        builder.addTriggerContentUri(triggerContentUri);
        builder.setTriggerContentUpdateDelay(30000L);
        builder.setTriggerContentMaxDelay(60000L);
        ((JobScheduler) systemService).schedule(builder.build());
    }

    private static void d(ContentResolver contentResolver, ContentObserver contentObserver) {
        LogUtil.a("ContactsListenUtils", "listenContactsEarlierApi24: start");
        e = contentResolver;
        f42406a = contentObserver;
        contentResolver.registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, f42406a);
    }
}

package androidx.core.app;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class JobIntentService extends Service {
    public static final Object h = new Object();
    public static final HashMap<ComponentName, f> i = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f2053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f2054b;
    public a c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public final ArrayList<c> g = null;

    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                d dVarA = JobIntentService.this.a();
                if (dVarA == null) {
                    return null;
                }
                JobIntentService.this.d(dVarA.getIntent());
                dVarA.complete();
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            JobIntentService.this.f();
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            JobIntentService.this.f();
        }
    }

    public interface b {
        IBinder a();

        d b();
    }

    public final class c implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f2056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2057b;

        public c(Intent intent, int i) {
            this.f2056a = intent;
            this.f2057b = i;
        }

        @Override // androidx.core.app.JobIntentService.d
        public void complete() {
            JobIntentService.this.stopSelf(this.f2057b);
        }

        @Override // androidx.core.app.JobIntentService.d
        public Intent getIntent() {
            return this.f2056a;
        }
    }

    public interface d {
        void complete();

        Intent getIntent();
    }

    @RequiresApi(26)
    public static final class e extends JobServiceEngine implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JobIntentService f2058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f2059b;
        public JobParameters c;

        public final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final JobWorkItem f2060a;

            public a(JobWorkItem jobWorkItem) {
                this.f2060a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.d
            public void complete() {
                synchronized (e.this.f2059b) {
                    try {
                        JobParameters jobParameters = e.this.c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f2060a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.d
            public Intent getIntent() {
                return this.f2060a.getIntent();
            }
        }

        public e(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2059b = new Object();
            this.f2058a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.b
        public IBinder a() {
            return getBinder();
        }

        @Override // androidx.core.app.JobIntentService.b
        public d b() {
            synchronized (this.f2059b) {
                try {
                    JobParameters jobParameters = this.c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f2058a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.c = jobParameters;
            this.f2058a.c(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f2058a.b();
            synchronized (this.f2059b) {
                this.c = null;
            }
            return zB;
        }
    }

    public static abstract class f {
        public abstract void a();

        public abstract void b();

        public abstract void c();
    }

    public d a() {
        b bVar = this.f2053a;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.g) {
            try {
                if (this.g.size() <= 0) {
                    return null;
                }
                return this.g.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean b() {
        a aVar = this.c;
        if (aVar != null) {
            aVar.cancel(this.d);
        }
        this.e = true;
        return e();
    }

    public void c(boolean z) {
        if (this.c == null) {
            this.c = new a();
            this.c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public abstract void d(Intent intent);

    public boolean e() {
        return true;
    }

    public void f() {
        ArrayList<c> arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.c = null;
                    ArrayList<c> arrayList2 = this.g;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        c(false);
                    } else if (!this.f) {
                        this.f2054b.a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        b bVar = this.f2053a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f2053a = new e(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<c> arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f = true;
                this.f2054b.a();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        if (this.g == null) {
            return 2;
        }
        this.f2054b.c();
        synchronized (this.g) {
            ArrayList<c> arrayList = this.g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c(intent, i3));
            c(true);
        }
        return 3;
    }
}

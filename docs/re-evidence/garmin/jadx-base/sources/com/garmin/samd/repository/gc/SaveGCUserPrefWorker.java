package com.garmin.samd.repository.gc;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.d;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import lx2.b;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/garmin/samd/repository/gc/SaveGCUserPrefWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SaveGCUserPrefWorker extends Worker {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f52671e = new a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveGCUserPrefWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final d.a c() {
        b bVar = null;
        try {
            c cVar = this.f11470b.f11427b;
            String strE = cVar.e(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            strE.getClass();
            String strE2 = cVar.e("4");
            strE2.getClass();
            String strE3 = cVar.e("2");
            strE3.getClass();
            b bVar2 = new b(strE3, String.valueOf(cVar.a("3", true)));
            try {
                bVar2.toString();
                og.a.U(bVar2, strE, strE2);
                return new d.a.c();
            } catch (Throwable unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.toString();
                }
                return new d.a.b();
            }
        } catch (Throwable unused2) {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/samd/repository/gc/SaveGCUserPrefWorker$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "WORK_NAME", "SaMD_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

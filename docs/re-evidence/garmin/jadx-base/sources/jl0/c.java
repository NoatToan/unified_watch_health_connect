package jl0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import e23.p;
import o13.r;
import o53.b0;
import o53.e1;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljl0/c;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends BroadcastReceiver {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.golf.courses.presentation.GolfCourseFileDownloadReceiver$onReceive$1", f = "GolfCourseFileDownloadReceiver.kt", l = {24, 26}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f99458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Intent f99459b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Intent intent, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f99459b = intent;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f99459b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r10 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
        
            if (r10.e(r9) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        
            return r0;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f99458a;
            if (i14 == 0) {
                r.b(obj);
                long longExtra = this.f99459b.getLongExtra("extra_download_id", -1L);
                hl0.a aVar = (hl0.a) KoinJavaComponent.get$default(hl0.a.class, null, null, 6, null);
                if (longExtra != -1) {
                    this.f99458a = 1;
                    aVar.getClass();
                    x53.c cVar = s0.f129406a;
                    Object objE0 = ge1.b.e0(x53.b.f189152a, new hl0.b(longExtra, aVar, null), this);
                    if (objE0 != obj2) {
                        objE0 = Unit.INSTANCE;
                    }
                    if (objE0 != obj2) {
                        objE0 = Unit.INSTANCE;
                    }
                } else {
                    this.f99458a = 2;
                }
            } else {
                if (i14 != 1 && i14 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            b bVar = new b(intent, null);
            t13.h hVar = t13.h.f161748a;
            hVar.getClass();
            ge1.b.T(e1.f129333a, hVar, null, new g22.b(bVar, goAsync(), null), 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljl0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}

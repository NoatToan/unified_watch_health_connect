package vt;

import android.content.Intent;
import android.net.Uri;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity;
import e23.p;
import java.util.Objects;
import o13.r;
import o53.b0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity$shareImage$1", f = "MultipleImagesShareSampleActivity.kt", l = {108, 111}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f180012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultipleImagesShareSampleActivity f180013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f180014c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity$shareImage$1$1", f = "MultipleImagesShareSampleActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Uri f180015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f180016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MultipleImagesShareSampleActivity f180017c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri, boolean z14, MultipleImagesShareSampleActivity multipleImagesShareSampleActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f180015a = uri;
            this.f180016b = z14;
            this.f180017c = multipleImagesShareSampleActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f180015a, this.f180016b, this.f180017c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.setType("image/*");
            intent.addFlags(1);
            Uri uri = this.f180015a;
            intent.putExtra("android.intent.extra.STREAM", uri);
            Objects.toString(uri);
            if (this.f180016b) {
                intent = Intent.createChooser(intent, "Share Image.");
            }
            this.f180017c.startActivity(intent);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Landroid/net/Uri;", "<anonymous>", "(Lo53/b0;)Landroid/net/Uri;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.annual_report.developer_option.MultipleImagesShareSampleActivity$shareImage$1$imageUri$1", f = "MultipleImagesShareSampleActivity.kt", l = {109}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Uri>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f180018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MultipleImagesShareSampleActivity f180019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MultipleImagesShareSampleActivity multipleImagesShareSampleActivity, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f180019b = multipleImagesShareSampleActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f180019b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Uri> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f180018a;
            if (i14 == 0) {
                r.b(obj);
                this.f180018a = 1;
                Object objA = j.a(this.f180019b, R.drawable.share1, "share1.jpg", this);
                return objA == aVar ? aVar : objA;
            }
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(MultipleImagesShareSampleActivity multipleImagesShareSampleActivity, boolean z14, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f180013b = multipleImagesShareSampleActivity;
        this.f180014c = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f180013b, this.f180014c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (ge1.b.e0(r1, r4, r7) == r0) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f180012a;
        MultipleImagesShareSampleActivity multipleImagesShareSampleActivity = this.f180013b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
        r.b(obj);
        x53.c cVar = s0.f129406a;
        x53.b bVar = x53.b.f189152a;
        b bVar2 = new b(multipleImagesShareSampleActivity, null);
        this.f180012a = 1;
        obj = ge1.b.e0(bVar, bVar2, this);
        if (obj != aVar) {
        }
        return aVar;
        x53.c cVar2 = s0.f129406a;
        t1 t1Var = o.f168762a;
        a aVar2 = new a((Uri) obj, this.f180014c, multipleImagesShareSampleActivity, null);
        this.f180012a = 2;
    }
}

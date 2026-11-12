package op2;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerBankTermsConditionActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.managecard.FitPayCardDetailsActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import o13.r;
import o53.b0;
import o53.f0;
import o53.j0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity$handleManageCardFlow$1", f = "NewFitPayWebNavigationActivity.kt", l = {471, 479}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qs2.d f133225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public yo2.b f133226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f133228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ NewFitPayWebNavigationActivity f133229e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lyo2/b;", "<anonymous>", "(Lo53/b0;)Lyo2/b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity$handleManageCardFlow$1$creditCard$1", f = "NewFitPayWebNavigationActivity.kt", l = {470}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super yo2.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f133230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NewFitPayWebNavigationActivity f133231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ qs2.d f133232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NewFitPayWebNavigationActivity newFitPayWebNavigationActivity, qs2.d dVar, t13.d<? super a> dVar2) {
            super(2, dVar2);
            this.f133231b = newFitPayWebNavigationActivity;
            this.f133232c = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f133231b, this.f133232c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super yo2.b> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133230a;
            if (i14 == 0) {
                r.b(obj);
                this.f133230a = 1;
                Object objCa = NewFitPayWebNavigationActivity.ca(this.f133231b, this.f133232c, this);
                return objCa == aVar ? aVar : objCa;
            }
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsd2/f;", "<anonymous>", "(Lo53/b0;)Lsd2/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebNavigationActivity$handleManageCardFlow$1$deviceRecord$1", f = "NewFitPayWebNavigationActivity.kt", l = {481}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super sd2.f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f133233a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ NewFitPayWebNavigationActivity f133234b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NewFitPayWebNavigationActivity newFitPayWebNavigationActivity, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f133234b = newFitPayWebNavigationActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f133234b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super sd2.f> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133233a;
            NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f133234b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    d dVar = newFitPayWebNavigationActivity.f51554j;
                    if (dVar == null) {
                        s.m("fitPayWebNavigationViewModel");
                        throw null;
                    }
                    this.f133233a = 1;
                    obj = dVar.m0(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return (sd2.f) obj;
            } catch (Exception e4) {
                Logger logger = NewFitPayWebNavigationActivity.f51550x;
                d dVar2 = newFitPayWebNavigationActivity.f51554j;
                if (dVar2 == null) {
                    s.m("fitPayWebNavigationViewModel");
                    throw null;
                }
                logger.error("handleAddCardFlow: can not get device record for " + dVar2.getDeviceUnitId(), (Throwable) e4);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(NewFitPayWebNavigationActivity newFitPayWebNavigationActivity, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f133229e = newFitPayWebNavigationActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f133229e, dVar);
        lVar.f133228d = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00bf A[Catch: Exception -> 0x0023, TRY_ENTER, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d9 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x0108 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x010e A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0127 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x012b A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX WARN: Code duplicated, block: B:75:0x0135 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x013b A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0158 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x015c A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0164  */
    /* JADX WARN: Code duplicated, block: B:83:0x0166 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x016c A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0172 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0192 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x019a  */
    /* JADX WARN: Code duplicated, block: B:92:0x019b A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d4 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x001b, B:47:0x00b9, B:50:0x00bf, B:52:0x00c5, B:53:0x00d9, B:54:0x00dc, B:55:0x00dd, B:56:0x00e5, B:58:0x00ea, B:83:0x0166, B:85:0x016c, B:88:0x0177, B:87:0x0172, B:61:0x00f4, B:64:0x00fe, B:67:0x0108, B:69:0x010e, B:70:0x0127, B:71:0x012a, B:72:0x012b, B:75:0x0135, B:77:0x013b, B:78:0x0158, B:79:0x015b, B:80:0x015c, B:89:0x0192, B:92:0x019b, B:94:0x01d4, B:15:0x002e, B:37:0x0088, B:39:0x008c, B:41:0x0099, B:43:0x009d, B:95:0x01d8, B:96:0x01dd, B:18:0x0038, B:21:0x0046, B:30:0x005e, B:32:0x0062, B:34:0x006c, B:24:0x0051, B:26:0x0057, B:29:0x005c), top: B:100:0x0011 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:52:0x00c5, please report this as an issue */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Parcelable parcelable;
        qs2.d dVar;
        Object objC;
        yo2.b bVar;
        Object objE0;
        qs2.d dVar2;
        yo2.b bVar2;
        sd2.f fVar;
        String cardState;
        androidx.appcompat.app.e eVarQ;
        FitPayCardVerificationActivity.b bVar3;
        d dVar3;
        FitPayIssuerBankTermsConditionActivity.a aVar;
        d dVar4;
        long f73431f;
        Logger logger;
        d dVar5;
        b0 b0Var = (b0) this.f133228d;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f133227c;
        NewFitPayWebNavigationActivity newFitPayWebNavigationActivity = this.f133229e;
        try {
            if (i14 == 0) {
                r.b(obj);
                Intent intent = newFitPayWebNavigationActivity.getIntent();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("extra.wallet.item", qs2.d.class) : null;
                } else {
                    Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra.wallet.item") : null;
                    if (!(parcelableExtra instanceof qs2.d)) {
                        parcelableExtra = null;
                    }
                    parcelable = (qs2.d) parcelableExtra;
                }
                dVar = (qs2.d) parcelable;
                if (dVar == null) {
                    NewFitPayWebNavigationActivity.f51550x.error("handleManageCardFlow: missing fitPay wallet item");
                    return Unit.INSTANCE;
                }
                j0 j0VarJ = ge1.b.j(f0.w(newFitPayWebNavigationActivity), s0.f129406a, null, new a(newFitPayWebNavigationActivity, dVar, null), 2);
                this.f133228d = b0Var;
                this.f133225a = dVar;
                this.f133227c = 1;
                objC = j0VarJ.C(this);
                if (objC == aVar2) {
                }
                return aVar2;
            }
            if (i14 == 1) {
                qs2.d dVar6 = this.f133225a;
                r.b(obj);
                dVar = dVar6;
                objC = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = this.f133226b;
                dVar2 = this.f133225a;
                r.b(obj);
                objE0 = obj;
            }
            bVar2 = bVar;
            fVar = (sd2.f) objE0;
            if (fVar == null) {
                logger = NewFitPayWebNavigationActivity.f51550x;
                dVar5 = newFitPayWebNavigationActivity.f51554j;
                if (dVar5 != null) {
                    s.m("fitPayWebNavigationViewModel");
                    throw null;
                }
                logger.warn("handleAddCardFlow: can not get device record for " + dVar5.getDeviceUnitId());
            }
            cardState = bVar2.getCardState();
            switch (cardState.hashCode()) {
                case -2026521607:
                    if (!cardState.equals("DELETED")) {
                        NewFitPayWebNavigationActivity.a aVar3 = NewFitPayWebNavigationActivity.f51549w;
                        String string = newFitPayWebNavigationActivity.getString(R.string.dialog_title_error);
                        string.getClass();
                        String string2 = newFitPayWebNavigationActivity.getString(R.string.card_deleted);
                        string2.getClass();
                        String string3 = newFitPayWebNavigationActivity.getString(R.string.lbl_ok);
                        string3.getClass();
                        eVarQ = br2.c.q(br2.c.f19585a, newFitPayWebNavigationActivity, string, string2, new o13.p(string3, new m92.f(newFitPayWebNavigationActivity, 23)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                        if (eVarQ != null) {
                            eVarQ.show();
                        }
                    }
                    return Unit.INSTANCE;
                case 382849616:
                    if (!cardState.equals("DEACTIVATED")) {
                        f.c<Intent> cVar = newFitPayWebNavigationActivity.f51564v;
                        FitPayCardDetailsActivity.a aVar4 = FitPayCardDetailsActivity.F;
                        if (fVar != null) {
                            f73431f = fVar.getUnitID();
                        } else {
                            f73431f = dVar2.getF73431f();
                        }
                        long j8 = f73431f;
                        String f73437l = dVar2.getF73437l();
                        boolean f73438m = dVar2.getF73438m();
                        String creditCardId = bVar2.getCreditCardId();
                        String paymentCardId = bVar2.getPaymentCardId();
                        aVar4.getClass();
                        cVar.a(FitPayCardDetailsActivity.a.a(j8, f73437l, creditCardId, paymentCardId, f73438m), null);
                    }
                    return Unit.INSTANCE;
                case 793439203:
                    if (!cardState.equals("PENDING_VERIFICATION")) {
                        bVar3 = FitPayCardVerificationActivity.f51449m;
                        dVar3 = newFitPayWebNavigationActivity.f51554j;
                        if (dVar3 != null) {
                            s.m("fitPayWebNavigationViewModel");
                            throw null;
                        }
                        Long l14 = new Long(dVar3.getDeviceUnitId());
                        String creditCardId2 = bVar2.getCreditCardId();
                        bVar3.getClass();
                        newFitPayWebNavigationActivity.startActivity(FitPayCardVerificationActivity.b.a(l14, creditCardId2, false, null));
                        newFitPayWebNavigationActivity.finish();
                    }
                    return Unit.INSTANCE;
                case 883370455:
                    if (!cardState.equals("ELIGIBLE")) {
                        aVar = FitPayIssuerBankTermsConditionActivity.f51592t;
                        dVar4 = newFitPayWebNavigationActivity.f51554j;
                        if (dVar4 != null) {
                            s.m("fitPayWebNavigationViewModel");
                            throw null;
                        }
                        newFitPayWebNavigationActivity.startActivity(FitPayIssuerBankTermsConditionActivity.a.c(aVar, new Long(dVar4.getDeviceUnitId()), bVar2, false, null, 124));
                        newFitPayWebNavigationActivity.finish();
                    }
                    return Unit.INSTANCE;
                case 1925346054:
                    if (!cardState.equals("ACTIVE")) {
                        f.c<Intent> cVar2 = newFitPayWebNavigationActivity.f51564v;
                        FitPayCardDetailsActivity.a aVar5 = FitPayCardDetailsActivity.F;
                        if (fVar != null) {
                            f73431f = fVar.getUnitID();
                        } else {
                            f73431f = dVar2.getF73431f();
                        }
                        long j14 = f73431f;
                        String f73437l2 = dVar2.getF73437l();
                        boolean f73438m2 = dVar2.getF73438m();
                        String creditCardId3 = bVar2.getCreditCardId();
                        String paymentCardId2 = bVar2.getPaymentCardId();
                        aVar5.getClass();
                        cVar2.a(FitPayCardDetailsActivity.a.a(j14, f73437l2, creditCardId3, paymentCardId2, f73438m2), null);
                    }
                    return Unit.INSTANCE;
                case 2096142030:
                    if (!cardState.equals("PENDING_ACTIVE")) {
                        f.c<Intent> cVar3 = newFitPayWebNavigationActivity.f51564v;
                        FitPayCardDetailsActivity.a aVar6 = FitPayCardDetailsActivity.F;
                        if (fVar != null) {
                            f73431f = fVar.getUnitID();
                        } else {
                            f73431f = dVar2.getF73431f();
                        }
                        long j15 = f73431f;
                        String f73437l3 = dVar2.getF73437l();
                        boolean f73438m3 = dVar2.getF73438m();
                        String creditCardId4 = bVar2.getCreditCardId();
                        String paymentCardId3 = bVar2.getPaymentCardId();
                        aVar6.getClass();
                        cVar3.a(FitPayCardDetailsActivity.a.a(j15, f73437l3, creditCardId4, paymentCardId3, f73438m3), null);
                    }
                    return Unit.INSTANCE;
                default:
                    return Unit.INSTANCE;
            }
            bVar = (yo2.b) objC;
            if (bVar == null) {
                NewFitPayWebNavigationActivity.f51550x.error("handleManageCardFlow: failed to get credit card");
                newFitPayWebNavigationActivity.da();
                return Unit.INSTANCE;
            }
            z0 z0Var = newFitPayWebNavigationActivity.f51558n;
            if (z0Var == null) {
                s.m("fitPayServiceProvider");
                throw null;
            }
            z0Var.s();
            x53.c cVar4 = s0.f129406a;
            b bVar4 = new b(newFitPayWebNavigationActivity, null);
            this.f133228d = null;
            this.f133225a = dVar;
            this.f133226b = bVar;
            this.f133227c = 2;
            objE0 = ge1.b.e0(cVar4, bVar4, this);
            if (objE0 != aVar2) {
                dVar2 = dVar;
                bVar2 = bVar;
                fVar = (sd2.f) objE0;
                if (fVar == null) {
                    logger = NewFitPayWebNavigationActivity.f51550x;
                    dVar5 = newFitPayWebNavigationActivity.f51554j;
                    if (dVar5 != null) {
                        s.m("fitPayWebNavigationViewModel");
                        throw null;
                    }
                    logger.warn("handleAddCardFlow: can not get device record for " + dVar5.getDeviceUnitId());
                }
                cardState = bVar2.getCardState();
                switch (cardState.hashCode()) {
                    case -2026521607:
                        if (!cardState.equals("DELETED")) {
                            NewFitPayWebNavigationActivity.a aVar7 = NewFitPayWebNavigationActivity.f51549w;
                            String string4 = newFitPayWebNavigationActivity.getString(R.string.dialog_title_error);
                            string4.getClass();
                            String string5 = newFitPayWebNavigationActivity.getString(R.string.card_deleted);
                            string5.getClass();
                            String string6 = newFitPayWebNavigationActivity.getString(R.string.lbl_ok);
                            string6.getClass();
                            eVarQ = br2.c.q(br2.c.f19585a, newFitPayWebNavigationActivity, string4, string5, new o13.p(string6, new m92.f(newFitPayWebNavigationActivity, 23)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            if (eVarQ != null) {
                                eVarQ.show();
                            }
                        }
                        return Unit.INSTANCE;
                    case 382849616:
                        if (!cardState.equals("DEACTIVATED")) {
                            f.c<Intent> cVar5 = newFitPayWebNavigationActivity.f51564v;
                            FitPayCardDetailsActivity.a aVar8 = FitPayCardDetailsActivity.F;
                            if (fVar != null) {
                                f73431f = fVar.getUnitID();
                            } else {
                                f73431f = dVar2.getF73431f();
                            }
                            long j16 = f73431f;
                            String f73437l4 = dVar2.getF73437l();
                            boolean f73438m4 = dVar2.getF73438m();
                            String creditCardId5 = bVar2.getCreditCardId();
                            String paymentCardId4 = bVar2.getPaymentCardId();
                            aVar8.getClass();
                            cVar5.a(FitPayCardDetailsActivity.a.a(j16, f73437l4, creditCardId5, paymentCardId4, f73438m4), null);
                        }
                        return Unit.INSTANCE;
                    case 793439203:
                        if (!cardState.equals("PENDING_VERIFICATION")) {
                            bVar3 = FitPayCardVerificationActivity.f51449m;
                            dVar3 = newFitPayWebNavigationActivity.f51554j;
                            if (dVar3 != null) {
                                s.m("fitPayWebNavigationViewModel");
                                throw null;
                            }
                            Long l15 = new Long(dVar3.getDeviceUnitId());
                            String creditCardId6 = bVar2.getCreditCardId();
                            bVar3.getClass();
                            newFitPayWebNavigationActivity.startActivity(FitPayCardVerificationActivity.b.a(l15, creditCardId6, false, null));
                            newFitPayWebNavigationActivity.finish();
                        }
                        return Unit.INSTANCE;
                    case 883370455:
                        if (!cardState.equals("ELIGIBLE")) {
                            aVar = FitPayIssuerBankTermsConditionActivity.f51592t;
                            dVar4 = newFitPayWebNavigationActivity.f51554j;
                            if (dVar4 != null) {
                                s.m("fitPayWebNavigationViewModel");
                                throw null;
                            }
                            newFitPayWebNavigationActivity.startActivity(FitPayIssuerBankTermsConditionActivity.a.c(aVar, new Long(dVar4.getDeviceUnitId()), bVar2, false, null, 124));
                            newFitPayWebNavigationActivity.finish();
                        }
                        return Unit.INSTANCE;
                    case 1925346054:
                        if (!cardState.equals("ACTIVE")) {
                            f.c<Intent> cVar6 = newFitPayWebNavigationActivity.f51564v;
                            FitPayCardDetailsActivity.a aVar9 = FitPayCardDetailsActivity.F;
                            if (fVar != null) {
                                f73431f = fVar.getUnitID();
                            } else {
                                f73431f = dVar2.getF73431f();
                            }
                            long j17 = f73431f;
                            String f73437l5 = dVar2.getF73437l();
                            boolean f73438m5 = dVar2.getF73438m();
                            String creditCardId7 = bVar2.getCreditCardId();
                            String paymentCardId5 = bVar2.getPaymentCardId();
                            aVar9.getClass();
                            cVar6.a(FitPayCardDetailsActivity.a.a(j17, f73437l5, creditCardId7, paymentCardId5, f73438m5), null);
                        }
                        return Unit.INSTANCE;
                    case 2096142030:
                        if (!cardState.equals("PENDING_ACTIVE")) {
                            f.c<Intent> cVar7 = newFitPayWebNavigationActivity.f51564v;
                            FitPayCardDetailsActivity.a aVar10 = FitPayCardDetailsActivity.F;
                            if (fVar != null) {
                                f73431f = fVar.getUnitID();
                            } else {
                                f73431f = dVar2.getF73431f();
                            }
                            long j18 = f73431f;
                            String f73437l6 = dVar2.getF73437l();
                            boolean f73438m6 = dVar2.getF73438m();
                            String creditCardId8 = bVar2.getCreditCardId();
                            String paymentCardId6 = bVar2.getPaymentCardId();
                            aVar10.getClass();
                            cVar7.a(FitPayCardDetailsActivity.a.a(j18, f73437l6, creditCardId8, paymentCardId6, f73438m6), null);
                        }
                        return Unit.INSTANCE;
                    default:
                        return Unit.INSTANCE;
                }
            }
            return aVar2;
        } catch (Exception e4) {
            NewFitPayWebNavigationActivity.f51550x.error("handleManageCardFlow: ", (Throwable) e4);
            newFitPayWebNavigationActivity.da();
        }
    }
}

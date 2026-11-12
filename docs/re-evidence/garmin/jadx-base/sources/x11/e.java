package x11;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b21.o4;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.p;
import java.util.Locale;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v01.m0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lx11/e;", "Landroidx/lifecycle/u1;", "", TtmlNode.TAG_REGION, "language", "Lb21/o4;", "mode", "Lm01/g;", "nutritionRepository", "Lv01/m0;", "getFoodsFromImageRecognitionUseCase", "Le01/a;", "preferences", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lb21/o4;Lm01/g;Lv01/m0;Le01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m01.g f188397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f188398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f188399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f188400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f188401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f188402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b2 f188403g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lx11/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.imagerecognition.viewmodel.ImageRecognitionAndBarcodeScannerViewModel$uiState$1", f = "ImageRecognitionAndBarcodeScannerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<r53.j<? super b>, t13.d<? super Unit>, Object> {
        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super b> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            e eVar = e.this;
            x11.a aVarS = eVar.f188399c.s();
            p2 p2Var = eVar.f188402f;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, b.a((b) value, aVarS, false, false, false, false, false, false, null, null, 1021)));
            return Unit.INSTANCE;
        }
    }

    public e(String str, String str2, o4 o4Var, m01.g gVar, m0 m0Var, e01.a aVar) {
        String country;
        String language;
        o4Var.getClass();
        gVar.getClass();
        m0Var.getClass();
        aVar.getClass();
        this.f188397a = gVar;
        this.f188398b = m0Var;
        this.f188399c = aVar;
        if (str == null) {
            country = Locale.US.getCountry();
            country.getClass();
        } else {
            country = str;
        }
        this.f188400d = country;
        if (str2 == null) {
            language = Locale.ENGLISH.getLanguage();
            language.getClass();
        } else {
            language = str2;
        }
        this.f188401e = language;
        p2 p2VarA = q2.a(new b(o4Var, null, false, false, false, false, false, false, null, null, 1022, null));
        this.f188402f = p2VarA;
        v vVar = new v(new a(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f188403g = s.K(vVar, aVarA, k2.a.f150706c, new b(o4Var, null, false, false, false, false, false, false, null, null, 1022, null));
    }

    public final void x4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f188402f;
            value = p2Var.getValue();
        } while (!p2Var.b(value, b.a((b) value, null, false, false, false, false, true, false, null, null, 139)));
    }
}

package xe2;

import android.content.Context;
import android.text.TextUtils;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Locale;
import org.json.JSONObject;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag$determineMinAgeText$1", f = "TermsOfUseFrag.kt", l = {338, 364, 369, 373, 390}, m = "invokeSuspend")
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f190540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f190541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f190542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190543d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.android.library.mobileauth.ui.TermsOfUseFrag$determineMinAgeText$1$2$1", f = "TermsOfUseFrag.kt", l = {383}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f190544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.library.mobileauth.ui.e f190545b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.library.mobileauth.ui.e eVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f190545b = eVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f190545b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f190544a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f190544a = 1;
                if (com.garmin.android.library.mobileauth.ui.e.y6(this.f190545b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.garmin.android.library.mobileauth.ui.e eVar, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f190543d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        r0 r0Var = new r0(this.f190543d, dVar);
        r0Var.f190542c = obj;
        return r0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:61:0x0134, B:15:0x002d, B:57:0x0124, B:16:0x0032, B:53:0x0114, B:19:0x003d, B:29:0x008b, B:31:0x0091, B:34:0x0096, B:36:0x00a5, B:38:0x00be, B:40:0x00d0, B:41:0x00d5, B:43:0x00e1, B:44:0x00e6, B:46:0x00ec, B:48:0x00f4, B:50:0x00fe, B:54:0x0117, B:58:0x0127, B:66:0x013a, B:67:0x013d, B:35:0x009e, B:25:0x0075, B:37:0x00ba, B:64:0x0138), top: B:80:0x000e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d0 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:61:0x0134, B:15:0x002d, B:57:0x0124, B:16:0x0032, B:53:0x0114, B:19:0x003d, B:29:0x008b, B:31:0x0091, B:34:0x0096, B:36:0x00a5, B:38:0x00be, B:40:0x00d0, B:41:0x00d5, B:43:0x00e1, B:44:0x00e6, B:46:0x00ec, B:48:0x00f4, B:50:0x00fe, B:54:0x0117, B:58:0x0127, B:66:0x013a, B:67:0x013d, B:35:0x009e, B:25:0x0075, B:37:0x00ba, B:64:0x0138), top: B:80:0x000e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:61:0x0134, B:15:0x002d, B:57:0x0124, B:16:0x0032, B:53:0x0114, B:19:0x003d, B:29:0x008b, B:31:0x0091, B:34:0x0096, B:36:0x00a5, B:38:0x00be, B:40:0x00d0, B:41:0x00d5, B:43:0x00e1, B:44:0x00e6, B:46:0x00ec, B:48:0x00f4, B:50:0x00fe, B:54:0x0117, B:58:0x0127, B:66:0x013a, B:67:0x013d, B:35:0x009e, B:25:0x0075, B:37:0x00ba, B:64:0x0138), top: B:80:0x000e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:61:0x0134, B:15:0x002d, B:57:0x0124, B:16:0x0032, B:53:0x0114, B:19:0x003d, B:29:0x008b, B:31:0x0091, B:34:0x0096, B:36:0x00a5, B:38:0x00be, B:40:0x00d0, B:41:0x00d5, B:43:0x00e1, B:44:0x00e6, B:46:0x00ec, B:48:0x00f4, B:50:0x00fe, B:54:0x0117, B:58:0x0127, B:66:0x013a, B:67:0x013d, B:35:0x009e, B:25:0x0075, B:37:0x00ba, B:64:0x0138), top: B:80:0x000e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:61:0x0134, B:15:0x002d, B:57:0x0124, B:16:0x0032, B:53:0x0114, B:19:0x003d, B:29:0x008b, B:31:0x0091, B:34:0x0096, B:36:0x00a5, B:38:0x00be, B:40:0x00d0, B:41:0x00d5, B:43:0x00e1, B:44:0x00e6, B:46:0x00ec, B:48:0x00f4, B:50:0x00fe, B:54:0x0117, B:58:0x0127, B:66:0x013a, B:67:0x013d, B:35:0x009e, B:25:0x0075, B:37:0x00ba, B:64:0x0138), top: B:80:0x000e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:61:0x0134, B:15:0x002d, B:57:0x0124, B:16:0x0032, B:53:0x0114, B:19:0x003d, B:29:0x008b, B:31:0x0091, B:34:0x0096, B:36:0x00a5, B:38:0x00be, B:40:0x00d0, B:41:0x00d5, B:43:0x00e1, B:44:0x00e6, B:46:0x00ec, B:48:0x00f4, B:50:0x00fe, B:54:0x0117, B:58:0x0127, B:66:0x013a, B:67:0x013d, B:35:0x009e, B:25:0x0075, B:37:0x00ba, B:64:0x0138), top: B:80:0x000e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:61:0x0134, B:15:0x002d, B:57:0x0124, B:16:0x0032, B:53:0x0114, B:19:0x003d, B:29:0x008b, B:31:0x0091, B:34:0x0096, B:36:0x00a5, B:38:0x00be, B:40:0x00d0, B:41:0x00d5, B:43:0x00e1, B:44:0x00e6, B:46:0x00ec, B:48:0x00f4, B:50:0x00fe, B:54:0x0117, B:58:0x0127, B:66:0x013a, B:67:0x013d, B:35:0x009e, B:25:0x0075, B:37:0x00ba, B:64:0x0138), top: B:80:0x000e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:58:0x0127 A[Catch: all -> 0x002a, TryCatch #2 {all -> 0x002a, blocks: (B:12:0x0025, B:61:0x0134, B:15:0x002d, B:57:0x0124, B:16:0x0032, B:53:0x0114, B:19:0x003d, B:29:0x008b, B:31:0x0091, B:34:0x0096, B:36:0x00a5, B:38:0x00be, B:40:0x00d0, B:41:0x00d5, B:43:0x00e1, B:44:0x00e6, B:46:0x00ec, B:48:0x00f4, B:50:0x00fe, B:54:0x0117, B:58:0x0127, B:66:0x013a, B:67:0x013d, B:35:0x009e, B:25:0x0075, B:37:0x00ba, B:64:0x0138), top: B:80:0x000e, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0133  */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016e, code lost:
    
        if (com.garmin.android.library.mobileauth.ui.e.y6(r9, r12) == r1) goto L73;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var;
        String str;
        ve2.e eVar;
        URL url;
        BufferedReader bufferedReader;
        String strOptString;
        String strOptString2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190541b;
        int i15 = 2;
        int i16 = 1;
        com.garmin.android.library.mobileauth.ui.e eVar2 = this.f190543d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                o53.b0 b0Var2 = (o53.b0) this.f190542c;
                Context applicationContext = eVar2.requireActivity().getApplicationContext();
                ud2.b bVar = ud2.b.f170019a;
                applicationContext.getClass();
                String country = Locale.getDefault().getCountry();
                bVar.getClass();
                String strA = ud2.b.a(applicationContext, country);
                re2.l0.f152316a.getClass();
                if (re2.l0.e(applicationContext) && o53.c0.g(b0Var2)) {
                    re2.b bVar2 = re2.b.f152215a;
                    this.f190542c = b0Var2;
                    this.f190540a = strA;
                    this.f190541b = 1;
                    bVar2.getClass();
                    Object objQ = re2.b.q(this);
                    if (objQ != aVar) {
                        b0Var = b0Var2;
                        obj = objQ;
                        str = strA;
                        eVar = (ve2.e) obj;
                        if (eVar != ve2.e.f177705e) {
                            url = new URL("https://static.garmin.cn/com.garmin.sso/createAccount/countryAgeMapping.json");
                        } else {
                            url = new URL("https://static.garmin.cn/com.garmin.sso/createAccount/countryAgeMapping.json");
                        }
                        InputStream inputStreamOpenStream = url.openStream();
                        inputStreamOpenStream.getClass();
                        bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenStream, d53.c.f57666b), 8192);
                        String strE = lg.d.E(bufferedReader);
                        bufferedReader.close();
                        JSONObject jSONObject = new JSONObject(strE);
                        strOptString = jSONObject.optString(str, "");
                        if (!TextUtils.isEmpty(strOptString)) {
                            strOptString.getClass();
                            eVar2.f50439k = strOptString;
                        }
                        strOptString2 = jSONObject.optString("DEFAULT", "");
                        if (!TextUtils.isEmpty(strOptString2)) {
                            strOptString2.getClass();
                            eVar2.f50438j = strOptString2;
                        }
                        if (o53.c0.g(b0Var)) {
                            if (p005kotlin.jvm.internal.s.g(str, LocaleUnitResolver.ImperialCountryCode.US)) {
                                this.f190542c = null;
                                this.f190540a = null;
                                this.f190541b = 4;
                                obj = com.garmin.android.library.mobileauth.ui.e.y6(eVar2, this);
                                if (obj == aVar) {
                                }
                            } else if (p005kotlin.jvm.internal.s.g(eVar2.f50438j, eVar2.f50439k)) {
                                this.f190542c = null;
                                this.f190540a = null;
                                this.f190541b = 3;
                                obj = com.garmin.android.library.mobileauth.ui.e.y6(eVar2, this);
                                if (obj == aVar) {
                                }
                            } else {
                                this.f190542c = null;
                                this.f190540a = null;
                                this.f190541b = 2;
                                x53.c cVar = o53.s0.f129406a;
                                obj = ge1.b.e0(u53.o.f168762a, new x0(eVar2, null), this);
                                if (obj == aVar) {
                                }
                            }
                        }
                    }
                } else if (o53.c0.g(b0Var2)) {
                    this.f190541b = 5;
                }
                return aVar;
            }
            if (i14 == 1) {
                str = this.f190540a;
                b0Var = (o53.b0) this.f190542c;
                o13.r.b(obj);
                eVar = (ve2.e) obj;
                if (eVar != ve2.e.f177705e || eVar == ve2.e.f177706f) {
                    url = new URL("https://static.garmin.cn/com.garmin.sso/createAccount/countryAgeMapping.json");
                } else {
                    url = new URL("https://static.garmin.com/com.garmin.sso/createAccount/countryAgeMapping.json");
                }
                InputStream inputStreamOpenStream2 = url.openStream();
                inputStreamOpenStream2.getClass();
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenStream2, d53.c.f57666b), 8192);
                try {
                    String strE2 = lg.d.E(bufferedReader);
                    bufferedReader.close();
                    JSONObject jSONObject2 = new JSONObject(strE2);
                    strOptString = jSONObject2.optString(str, "");
                    if (!TextUtils.isEmpty(strOptString)) {
                        strOptString.getClass();
                        eVar2.f50439k = strOptString;
                    }
                    strOptString2 = jSONObject2.optString("DEFAULT", "");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        strOptString2.getClass();
                        eVar2.f50438j = strOptString2;
                    }
                    if (o53.c0.g(b0Var)) {
                        if (p005kotlin.jvm.internal.s.g(str, LocaleUnitResolver.ImperialCountryCode.US)) {
                            this.f190542c = null;
                            this.f190540a = null;
                            this.f190541b = 4;
                            obj = com.garmin.android.library.mobileauth.ui.e.y6(eVar2, this);
                            if (obj == aVar) {
                            }
                        } else if (p005kotlin.jvm.internal.s.g(eVar2.f50438j, eVar2.f50439k)) {
                            this.f190542c = null;
                            this.f190540a = null;
                            this.f190541b = 2;
                            x53.c cVar2 = o53.s0.f129406a;
                            obj = ge1.b.e0(u53.o.f168762a, new x0(eVar2, null), this);
                            if (obj == aVar) {
                            }
                        } else {
                            this.f190542c = null;
                            this.f190540a = null;
                            this.f190541b = 3;
                            obj = com.garmin.android.library.mobileauth.ui.e.y6(eVar2, this);
                            if (obj == aVar) {
                            }
                        }
                        return aVar;
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        jg.b.l(bufferedReader, th3);
                        throw th4;
                    }
                }
            } else if (i14 == 2) {
                o13.r.b(obj);
            } else if (i14 == 3) {
                o13.r.b(obj);
            } else if (i14 == 4) {
                o13.r.b(obj);
            } else {
                if (i14 != 5) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Throwable th5) {
            ((Logger) eVar2.f50440l.getValue()).error("determineMinAgeText", th5);
            androidx.fragment.app.m activity = eVar2.getActivity();
            activity.getClass();
            ((com.garmin.android.library.mobileauth.ui.a) activity).O9(th5, new p0(eVar2, i16), new p0(eVar2, i15));
        }
        return Unit.INSTANCE;
    }
}

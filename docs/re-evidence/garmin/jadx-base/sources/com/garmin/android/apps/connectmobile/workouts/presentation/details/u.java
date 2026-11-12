package com.garmin.android.apps.connectmobile.workouts.presentation.details;

import androidx.lifecycle.w0;
import c62.h2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import o53.b0;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel$sendWorkoutToDevice$1", f = "WorkoutDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f48813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f48814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0<g3<Unit>> f48815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f48816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f48817e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48818a;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f48818a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(f fVar, w0<g3<Unit>> w0Var, boolean z14, long j8, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f48814b = fVar;
        this.f48815c = w0Var;
        this.f48816d = z14;
        this.f48817e = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        u uVar = new u(this.f48814b, this.f48815c, this.f48816d, this.f48817e, dVar);
        uVar.f48813a = obj;
        return uVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        String str;
        b0 b0Var = (b0) this.f48813a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        f fVar = this.f48814b;
        WorkoutDetailsDTO workoutDetailsDTO = fVar.f48605r;
        w0<g3<Unit>> w0Var = this.f48815c;
        if (workoutDetailsDTO == null) {
            w0Var.j(g3.a.a(g3.f35298f, "Null workout DTO", null, null, null, 14));
            return Unit.INSTANCE;
        }
        boolean z14 = this.f48816d;
        long j8 = this.f48817e;
        String strE = z14 ? org.apache.commons.lang3.e.e(j8, "?deviceId=") : "";
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", String.valueOf(j8));
            jSONObject.put("fileType", "FIT");
            jSONObject.put("messageType", "workouts");
            WorkoutDetailsDTO workoutDetailsDTO2 = fVar.f48605r;
            jSONObject.put("messageUrl", "workout-service*workout*FIT*" + (workoutDetailsDTO2 != null ? new Long(workoutDetailsDTO2.f48040a) : null) + strE);
            WorkoutDetailsDTO workoutDetailsDTO3 = fVar.f48605r;
            if (g22.n.d(workoutDetailsDTO3 != null ? workoutDetailsDTO3.f48041b : null)) {
                WorkoutDetailsDTO workoutDetailsDTO4 = fVar.f48605r;
                str = workoutDetailsDTO4 != null ? workoutDetailsDTO4.f48041b : null;
            } else {
                str = "GCM Message";
            }
            jSONObject.put("messageName", str);
            jSONObject.put("priority", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            jSONArray.put(jSONObject);
            String string = jSONArray.toString();
            string.getClass();
            String strReplace = string.replace('*', IOUtils.DIR_SEPARATOR_UNIX);
            strReplace.getClass();
            w0Var.n(xy2.b.K(fVar, new h2(fVar, strReplace, null)), new f.p(new bn0.h(this.f48815c, b0Var, this.f48814b, this.f48817e, 3)));
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "WorkoutDetailsViewModel", "Called endpoint to put workout into GC's download queue.");
            return Unit.INSTANCE;
        } catch (JSONException e4) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.g(a2Var2, "WorkoutDetailsViewModel", e4);
            w0Var.j(g3.a.a(g3.f35298f, e4.getMessage(), e4, null, null, 12));
            return Unit.INSTANCE;
        }
    }
}

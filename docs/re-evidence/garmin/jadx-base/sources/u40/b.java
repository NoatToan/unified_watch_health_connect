package u40;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c0;
import java.util.Set;
import p005kotlin.Metadata;
import ty1.f1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu40/b;", "Lcom/garmin/android/apps/connectmobile/c0;", "<init>", "()V", "a", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends c0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f168543j = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c60.b f168544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public bp.h f168545i;

    public b() {
        super(R.layout.course_point_details_bottom_sheet_header, null, R.layout.course_bottom_sheet_empty_content, false, 10, null);
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void u6(View view2) {
    }

    @Override // com.garmin.android.apps.connectmobile.c0
    public final void v6(View view2) {
        com.garmin.android.apps.connectmobile.courses.model.g gVar;
        Parcelable parcelable;
        Bundle arguments = getArguments();
        Drawable drawableA = null;
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("COURSE_POINT", com.garmin.android.apps.connectmobile.courses.model.g.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("COURSE_POINT");
                if (!(parcelable2 instanceof com.garmin.android.apps.connectmobile.courses.model.g)) {
                    parcelable2 = null;
                }
                parcelable = (com.garmin.android.apps.connectmobile.courses.model.g) parcelable2;
            }
            gVar = (com.garmin.android.apps.connectmobile.courses.model.g) parcelable;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            boolean z14 = false;
            if (!gVar.g()) {
                Bundle arguments2 = getArguments();
                if (arguments2 != null ? arguments2.getBoolean("IS_EDITABLE") : false) {
                    z14 = true;
                }
            }
            c cVar = new c(view2, z14, new tb0.d(21, this, gVar), new f1(this, 5));
            cVar.f168547b.setText(gVar.name);
            com.garmin.android.apps.connectmobile.courses.model.f.a aVar = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
            String coursePointType = gVar.getCoursePointType();
            aVar.getClass();
            com.garmin.android.apps.connectmobile.courses.model.f fVarA = com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType);
            View view3 = cVar.f168546a;
            Context context = view3.getContext();
            context.getClass();
            int dimensionPixelSize = view3.getResources().getDimensionPixelSize(R.dimen.icon_small);
            int color = a7.b.getColor(view3.getContext(), R.color.gcm_icon_secondary);
            int i14 = fVarA.f32924c;
            Set<com.garmin.android.apps.connectmobile.courses.model.f> set = f.f168568a;
            com.garmin.android.apps.connectmobile.courses.model.h hVar = fVarA.f32928g;
            u4.d dVar = hVar != null ? hVar.f32966b : null;
            if (dVar != null) {
                drawableA = s40.c.b(dVar, context, dimensionPixelSize, color);
            } else if (i14 != 0) {
                drawableA = j.a.a(context, i14);
            }
            cVar.f168548c.setImageDrawable(drawableA);
            Context context2 = view3.getContext();
            context2.getClass();
            cVar.f168549d.setText(dh.b.A(context2, fVarA.a()));
        }
    }

    public final void z6() {
        c60.b bVar = this.f168544h;
        if (bVar != null) {
            bVar.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lu40/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_COURSE_POINT", "EXTRA_IS_EDITABLE", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

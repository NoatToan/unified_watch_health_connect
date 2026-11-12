package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import h62.j;
import java.io.Serializable;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import r22.b0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/g;", "Lx22/a;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/f$a;", "<init>", "()V", "b", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends x22.a implements f.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f38946f = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f38947d = m.b(new j(this, 17));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DateTime f38948e;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/g$b;", "Lr22/b0;", "Landroidx/fragment/app/v;", "fragmentManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "intervalType", "Lorg/joda/time/DateTime;", "selectedDate", "<init>", "(Landroidx/fragment/app/v;Landroid/content/Context;ILorg/joda/time/DateTime;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends b0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v vVar, Context context, int i14, DateTime dateTime) {
            super(vVar, i14, null, null, context != null ? new x22.b(context) : new b0.c(), 12, null);
            vVar.getClass();
            if (dateTime != null) {
                this.f149912i = c(dateTime);
            }
        }

        @Override // r22.b0
        public final Fragment b(long j8, long j14) {
            LocalDate localDate = new DateTime(j8).toLocalDate();
            d.a aVar = d.Q0;
            localDate.getClass();
            aVar.getClass();
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("date", localDate.toString());
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f.a
    public final String A(Context context) {
        return a0.e(R.string.mct_steps_day_segment, context);
    }

    @Override // com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.f.a
    public final String k(i.c cVar) {
        cVar.getClass();
        String string = cVar.getString(R.string.mct_next_phase_day);
        string.getClass();
        return string;
    }

    @Override // x22.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        Serializable serializable;
        layoutInflater.getClass();
        DateTime dateTime = null;
        dateTime = null;
        if (bundle == null && (bundle2 = (Bundle) this.f38947d.getValue()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle2.getSerializable("EXTRA_SELECTED_DATE", DateTime.class);
            } else {
                Serializable serializable2 = bundle2.getSerializable("EXTRA_SELECTED_DATE");
                serializable = (DateTime) (serializable2 instanceof DateTime ? serializable2 : null);
            }
            dateTime = (DateTime) serializable;
        }
        this.f38948e = dateTime;
        return layoutInflater.inflate(R.layout.date_infinite_view_pager_fragment_layout, viewGroup, false);
    }

    @Override // x22.a
    public final b0 u6() {
        v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        return new b(childFragmentManager, getContext(), 1, this.f38948e);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/g$a;", "", "<init>", "()V", "", "EXTRA_SELECTED_DATE", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

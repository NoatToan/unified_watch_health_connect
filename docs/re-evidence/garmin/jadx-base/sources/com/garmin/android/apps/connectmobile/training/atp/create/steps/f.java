package com.garmin.android.apps.connectmobile.training.atp.create.steps;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/f;", "Lau1/a;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends au1.a implements View.OnClickListener {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f45267k = new a(null);

    @Override // yt1.e
    public final int V5() {
        return R.string.atp_lbl_long_run_day;
    }

    @Override // com.garmin.android.apps.connectmobile.training.atp.create.steps.b
    public final String b5() {
        return "LongRunDayFragment";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        Object next;
        view2.getClass();
        au1.h hVar = (au1.h) view2;
        Iterator<T> it = this.f13023j.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((au1.h) next).isChecked());
        au1.h hVar2 = (au1.h) next;
        if (hVar2 != null) {
            hVar2.setChecked(false);
        }
        hVar.setChecked(true);
    }

    @Override // au1.a, com.garmin.android.apps.connectmobile.training.atp.create.steps.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        au1.h hVarPrevious;
        List<String> listY;
        au1.h next;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        ArrayList<au1.h> arrayList = this.f13023j;
        for (au1.h hVar : arrayList) {
            List<String> listY2 = w6().y();
            if (listY2 == null || !listY2.contains(hVar.getAtpDay().f187130a)) {
                hVar.setEnabled(false);
            } else {
                hVar.setEnabled(true);
                hVar.setOnClickListener(this);
            }
        }
        String longRunDay = w6().getLongRunDay();
        if (longRunDay == null || longRunDay.length() == 0 || (listY = w6().y()) == null || !listY.contains(longRunDay)) {
            ListIterator<au1.h> listIterator = arrayList.listIterator(arrayList.size());
            do {
                if (!listIterator.hasPrevious()) {
                    hVarPrevious = null;
                    break;
                }
                hVarPrevious = listIterator.previous();
            } while (!hVarPrevious.isEnabled());
            au1.h hVar2 = hVarPrevious;
            if (hVar2 != null) {
                hVar2.setChecked(true);
            }
        } else {
            Iterator<au1.h> it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(next.getAtpDay().f187130a, longRunDay));
            au1.h hVar3 = next;
            if (hVar3 != null) {
                hVar3.setChecked(true);
            }
        }
        E6().setOnClickListener(new a32.b(this, 9));
        TextView textView = this.f13021h;
        if (textView == null) {
            s.m("headerInfo");
            throw null;
        }
        textView.setText(R.string.atp_msg_long_run_day_header);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/create/steps/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

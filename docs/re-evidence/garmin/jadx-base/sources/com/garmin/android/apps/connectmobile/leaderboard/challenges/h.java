package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMCheckableRow;
import java.text.DateFormatSymbols;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\t\nB\u001b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/h;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/h$a;", "", "lastSelectMonthIndex", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/k0;", "onMonthSelectListener", "<init>", "(Ljava/lang/Integer;Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/k0;)V", "a", "b", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends RecyclerView.h<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f37557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.a[] f37558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f37560d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/h$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "checkableRow", "<init>", "(Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f37561a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view2) {
            super(view2);
            view2.getClass();
            this.f37561a = view2;
        }
    }

    static {
        new b(null);
    }

    public h(Integer num, k0 k0Var) {
        k0Var.getClass();
        this.f37557a = k0Var;
        String[] months = new DateFormatSymbols().getMonths();
        int length = months.length;
        i.a[] aVarArr = new i.a[length];
        for (int i14 = 0; i14 < length; i14++) {
            aVarArr[i14] = null;
        }
        DateTime dateTimeNow = DateTime.now();
        int length2 = months.length;
        for (int i15 = 0; i15 < length2; i15++) {
            int monthOfYear = dateTimeNow.getMonthOfYear() - 1;
            if (i15 < monthOfYear) {
                aVarArr[(months.length - monthOfYear) + i15] = new i.a(vb.h.h(dateTimeNow.getYear() + 1, months[i15], StringUtils.SPACE), i15 + 1);
            } else {
                String str = months[i15];
                str.getClass();
                aVarArr[i15 - monthOfYear] = new i.a(str, i15 + 1);
            }
        }
        this.f37558b = aVarArr;
        this.f37559c = -1;
        this.f37560d = num;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f37558b.length;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14, List list) {
        a aVar = (a) f0Var;
        aVar.getClass();
        View view2 = aVar.f37561a;
        list.getClass();
        i.a aVar2 = this.f37558b[i14];
        boolean z14 = true;
        if (list.isEmpty()) {
            ((TextView) view2.findViewById(R.id.month_title)).setText(aVar2 != null ? aVar2.f37596a : null);
            if (this.f37559c != i14) {
                if (!p005kotlin.jvm.internal.s.g(aVar2 != null ? Integer.valueOf(aVar2.f37597b) : null, this.f37560d)) {
                    z14 = false;
                }
            }
            view2.getClass();
            ((GCMCheckableRow) view2).setChecked(z14);
            if (z14) {
                this.f37557a.a(aVar2);
                this.f37559c = aVar.getBindingAdapterPosition();
            }
        } else {
            z14 = this.f37559c == i14;
            view2.getClass();
            ((GCMCheckableRow) view2).setChecked(z14);
        }
        aVar.itemView.setOnClickListener(new lg1.b(this, i14, aVar, aVar2, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new a(n23.j.b(viewGroup, R.layout.adhoc_challenge_month_item_row, viewGroup, false));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/h$b;", "", "<init>", "()V", "", "NON_SELECT_POSITION", "I", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ h(Integer num, k0 k0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, k0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        ((a) f0Var).getClass();
    }
}

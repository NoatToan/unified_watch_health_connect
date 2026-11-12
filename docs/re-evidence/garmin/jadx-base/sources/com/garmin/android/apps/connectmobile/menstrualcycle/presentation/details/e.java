package com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details;

import am.j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/e;", "Lmx0/a;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/e$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "b", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends mx0.a<a> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/e$a;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f38940a;

        public a(String str) {
            str.getClass();
            this.f38940a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f38940a.equals(((a) obj).f38940a);
        }

        public final int hashCode() {
            return this.f38940a.hashCode();
        }

        public final String toString() {
            return j.m("DisplayChip(text=", this.f38940a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/e$b;", "Lmx0/a$a;", "Lcom/garmin/android/apps/connectmobile/menstrualcycle/presentation/details/e$a;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends mx0.a.AbstractC2298a<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Button f38941a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2) {
            super(view2);
            view2.getClass();
            this.f38941a = (Button) view2;
        }

        @Override // mx0.a.AbstractC2298a
        public final void d(a aVar) {
            a aVar2 = aVar;
            aVar2.getClass();
            String str = aVar2.f38940a;
            Button button = this.f38941a;
            button.setText(str);
            button.setSelected(true);
            button.setClickable(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        context.getClass();
        setHasStableIds(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final long getItemId(int i14) {
        return t(i14).f38940a.hashCode();
    }

    @Override // mx0.a
    public final mx0.a.AbstractC2298a r(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.view_display_chip, viewGroup, false);
        viewInflate.getClass();
        return new b(viewInflate);
    }
}

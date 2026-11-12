package com.garmin.android.apps.connectmobile.settings.devices.activityoptions;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.activityoptions.ActivityOptionsActivity;
import java.util.ArrayList;
import java.util.Comparator;
import n23.j;
import p005kotlin.Metadata;
import p13.c0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB?\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00070\nj\b\u0012\u0004\u0012\u00020\u0007`\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "", "Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "activityList", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "activityOptionComparator", "<init>", "(Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/ActivityOptionsActivity;Ljava/util/ArrayList;Ljava/util/Comparator;)V", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityOptionsActivity f42540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<String> f42541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Comparator<String> f42542c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActivityOptionsActivity f42543d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42544e;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/activityoptions/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0796a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f42545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f42546b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0796a(View view2) {
            super(view2);
            view2.getClass();
            this.f42545a = (TextView) view2.findViewById(R.id.tv_displayed_activities);
            this.f42546b = (ImageView) view2.findViewById(R.id.iv_delete);
        }
    }

    public a(ActivityOptionsActivity activityOptionsActivity, ArrayList<String> arrayList, Comparator<String> comparator) {
        activityOptionsActivity.getClass();
        arrayList.getClass();
        comparator.getClass();
        this.f42540a = activityOptionsActivity;
        this.f42541b = arrayList;
        this.f42542c = comparator;
        this.f42543d = activityOptionsActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f42541b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        C0796a c0796a = (C0796a) f0Var;
        String str = this.f42541b.get(i14);
        str.getClass();
        final String str2 = str;
        TextView textView = c0796a.f42545a;
        if (textView != null) {
            textView.setText(str2);
        }
        ImageView imageView = c0796a.f42546b;
        if (imageView != null) {
            final int i15 = 0;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: og1.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a f131997b;

                {
                    this.f131997b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i15) {
                        case 0:
                            ActivityOptionsActivity activityOptionsActivity = this.f131997b.f42543d;
                            activityOptionsActivity.getClass();
                            String str3 = str2;
                            activityOptionsActivity.ca(str3, false);
                            c cVarGa = activityOptionsActivity.ga();
                            ArrayList<String> arrayList = cVarGa.f131990a;
                            arrayList.add(str3);
                            c0.u(arrayList, cVarGa.f131991b);
                            cVarGa.notifyDataSetChanged();
                            activityOptionsActivity.fa().t(str3);
                            break;
                        default:
                            this.f131997b.f42543d.j9(str2);
                            break;
                    }
                }
            });
        }
        if (textView != null) {
            final int i16 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: og1.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.devices.activityoptions.a f131997b;

                {
                    this.f131997b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i16) {
                        case 0:
                            ActivityOptionsActivity activityOptionsActivity = this.f131997b.f42543d;
                            activityOptionsActivity.getClass();
                            String str3 = str2;
                            activityOptionsActivity.ca(str3, false);
                            c cVarGa = activityOptionsActivity.ga();
                            ArrayList<String> arrayList = cVarGa.f131990a;
                            arrayList.add(str3);
                            c0.u(arrayList, cVarGa.f131991b);
                            cVarGa.notifyDataSetChanged();
                            activityOptionsActivity.fa().t(str3);
                            break;
                        default:
                            this.f131997b.f42543d.j9(str2);
                            break;
                    }
                }
            });
        }
        u(c0796a, str2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new C0796a(j.b(viewGroup, R.layout.gcm3_displayed_activities_item, viewGroup, false));
    }

    public void r(String str) {
        ArrayList<String> arrayList = this.f42541b;
        arrayList.add(str);
        c0.u(arrayList, this.f42542c);
        notifyDataSetChanged();
    }

    public void t(String str) {
        this.f42541b.remove(str);
        notifyDataSetChanged();
    }

    public void u(C0796a c0796a, String str) {
        c0796a.getClass();
        ImageView imageView = c0796a.f42546b;
        b.f42547d.getClass();
        int i14 = b.f42549f;
        ActivityOptionsActivity activityOptionsActivity = this.f42540a;
        if (str.equals(activityOptionsActivity.getString(i14)) || str.equals(activityOptionsActivity.getString(b.f42550g)) || !this.f42544e) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else if (imageView != null) {
            imageView.setVisibility(0);
        }
    }
}

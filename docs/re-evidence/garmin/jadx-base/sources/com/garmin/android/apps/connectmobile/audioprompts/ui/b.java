package com.garmin.android.apps.connectmobile.audioprompts.ui;

import android.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import lq.g;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003\u000b\f\rB!\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/ui/b;", "Landroid/widget/ArrayAdapter;", "Lcom/garmin/android/apps/connectmobile/audioprompts/ui/b$a;", "Landroid/app/Activity;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "mSelectedItemIndex", "Lcom/garmin/android/apps/connectmobile/audioprompts/ui/b$b;", "mListener", "<init>", "(Landroid/app/Activity;ILcom/garmin/android/apps/connectmobile/audioprompts/ui/b$b;)V", "b", "c", "a", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends ArrayAdapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f30280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0475b f30282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LayoutInflater f30283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f30284e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/ui/b$a;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/audioprompts/ui/b;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f30285a;

        public a(b bVar) {
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.audioprompts.ui.b$b, reason: collision with other inner class name */
    public interface InterfaceC0475b {
        void r2(String str);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/audioprompts/ui/b$c;", "", "<init>", "(Lcom/garmin/android/apps/connectmobile/audioprompts/ui/b;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f30286a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public TextView f30287b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImageView f30288c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public View f30289d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f30290e;

        public c(b bVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Activity activity, int i14, InterfaceC0475b interfaceC0475b) {
        super(activity, R.layout.simple_list_item_2);
        activity.getClass();
        interfaceC0475b.getClass();
        this.f30280a = activity;
        this.f30281b = i14;
        this.f30282c = interfaceC0475b;
        this.f30284e = new ArrayList();
        LayoutInflater layoutInflater = activity.getLayoutInflater();
        layoutInflater.getClass();
        this.f30283d = layoutInflater;
        w13.c cVar = lu.b.f114922q;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            lu.b bVar = (lu.b) bVarN.next();
            a aVar = new a(this);
            aVar.f30285a = bVar.name();
            this.f30284e.add(aVar);
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.f30284e.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i14) {
        return (a) this.f30284e.get(i14);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        c cVar;
        String string;
        viewGroup.getClass();
        ArrayList arrayList = this.f30284e;
        if (view2 == null) {
            view2 = this.f30283d.inflate(com.garmin.android.apps.connectmobile.R.layout.gcm3_frequency_type_row, viewGroup, false);
            cVar = new c(this);
            cVar.f30286a = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.checkable_row_container);
            cVar.f30287b = (TextView) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.checkable_row_name);
            cVar.f30288c = (ImageView) view2.findViewById(com.garmin.android.apps.connectmobile.R.id.checkable_row_img);
            cVar.f30289d = view2.findViewById(com.garmin.android.apps.connectmobile.R.id.frequency_type_divider);
            cVar.f30290e = i14;
            View view3 = cVar.f30286a;
            if (view3 != null) {
                view3.setTag(((a) arrayList.get(i14)).f30285a);
            }
            View view4 = cVar.f30286a;
            if (view4 != null) {
                view4.setOnClickListener(new g(25, this, cVar));
            }
            view2.setTag(cVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            cVar = (c) tag;
        }
        String str = ((a) arrayList.get(i14)).f30285a;
        str.getClass();
        lu.b bVarValueOf = lu.b.valueOf(str);
        View view5 = cVar.f30289d;
        if (i14 != 0) {
            view5.getClass();
            view5.setVisibility(4);
        } else {
            view5.getClass();
            view5.setVisibility(0);
        }
        int i15 = bVarValueOf.f114923a;
        Activity activity = this.f30280a;
        if (i15 == 0) {
            string = activity.getString(bVarValueOf.f114924b);
            string.getClass();
        } else {
            string = activity.getString(com.garmin.android.apps.connectmobile.R.string.common_minutes_label, Integer.valueOf(i15));
            string.getClass();
        }
        TextView textView = cVar.f30287b;
        textView.getClass();
        textView.setText(string);
        ImageView imageView = cVar.f30288c;
        if (i14 == this.f30281b) {
            imageView.getClass();
            imageView.setVisibility(0);
            return view2;
        }
        imageView.getClass();
        imageView.setVisibility(8);
        return view2;
    }
}

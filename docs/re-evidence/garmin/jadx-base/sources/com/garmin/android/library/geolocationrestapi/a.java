package com.garmin.android.library.geolocationrestapi;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.view.s0;
import androidx.recyclerview.widget.RecyclerView;
import aq.b0;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import n23.j;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/library/geolocationrestapi/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lcom/garmin/android/library/geolocationrestapi/a$a;", "Lcom/garmin/android/library/geolocationrestapi/CountrySettingActivity$b;", "callback", "<init>", "(Lcom/garmin/android/library/geolocationrestapi/CountrySettingActivity$b;)V", "a", "geolocation-rest-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class a extends RecyclerView.h<C0996a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<String> f50149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountrySettingActivity.b f50151c;

    /* JADX INFO: renamed from: com.garmin.android.library.geolocationrestapi.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/library/geolocationrestapi/a$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/library/geolocationrestapi/a;Landroid/view/View;)V", "geolocation-rest-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class C0996a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AppCompatRadioButton f50152a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0996a(a aVar, View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.geo_radio_button);
            viewFindViewById.getClass();
            this.f50152a = (AppCompatRadioButton) viewFindViewById;
        }
    }

    public a(CountrySettingActivity.b bVar) {
        bVar.getClass();
        this.f50149a = j0.f134944a;
        this.f50151c = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f50149a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        C0996a c0996a = (C0996a) f0Var;
        c0996a.getClass();
        AppCompatRadioButton appCompatRadioButton = c0996a.f50152a;
        appCompatRadioButton.setText(this.f50149a.get(i14));
        appCompatRadioButton.setChecked(i14 == this.f50150b);
        c0996a.itemView.setOnClickListener(new b0(this, i14, 20));
        s0.r(c0996a.itemView, new b(c0996a));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        return new C0996a(this, j.b(viewGroup, R.layout.country_setting_list_item, viewGroup, false));
    }
}

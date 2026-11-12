package com.garmin.android.apps.connectmobile.settings.devices.wifi;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.HashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/m;", "Landroid/widget/ArrayAdapter;", "Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/k;", "Landroid/content/Context;", "mContext", "", "resource", "mStartupMode", "<init>", "(Landroid/content/Context;II)V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends ArrayAdapter<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflater f43367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f43368d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/m$b;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f43369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f43370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ProgressBar f43371c;
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, int i14, int i15) {
        super(context, i14);
        context.getClass();
        this.f43365a = context;
        this.f43366b = i15;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        this.f43367c = layoutInflaterFrom;
        this.f43368d = new HashMap();
    }

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && arrayList.size() > 0) {
            arrayList2.addAll(arrayList);
        }
        if (this.f43366b == 102) {
            k kVar = new k("");
            kVar.f43327h = 3;
            arrayList2.add(kVar);
            k kVar2 = new k(getContext().getString(R.string.wifi_add_network_manually));
            kVar2.f43327h = 2;
            arrayList2.add(kVar2);
        }
        clear();
        addAll(arrayList2);
        notifyDataSetChanged();
    }

    public final void c(b bVar) {
        ProgressBar progressBar = bVar.f43371c;
        progressBar.getClass();
        if (progressBar.getVisibility() == 0) {
            return;
        }
        ImageView imageView = bVar.f43370b;
        imageView.getClass();
        imageView.setVisibility(0);
        ImageView imageView2 = bVar.f43370b;
        imageView2.getClass();
        Context context = this.f43365a;
        imageView2.setImageDrawable(a7.b.getDrawable(context, R.drawable.lock));
        ImageView imageView3 = bVar.f43370b;
        imageView3.getClass();
        imageView3.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary)));
    }

    public final void d(e eVar) {
        if (eVar == null || !eVar.b()) {
            return;
        }
        this.f43368d.put(eVar.f43295a, eVar);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        b bVar;
        e eVar;
        viewGroup.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.SETTINGS;
        aVar.getClass();
        i2.a.b(a2Var, "WiFiNetworkListAdapter", ".getView()");
        if (view2 == null) {
            view2 = this.f43367c.inflate(R.layout.gcm3_wifi_list_element, viewGroup, false);
            bVar = new b();
            View viewFindViewById = view2.findViewById(R.id.access_point_ssid);
            viewFindViewById.getClass();
            bVar.f43369a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.checkable_row_img);
            viewFindViewById2.getClass();
            bVar.f43370b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view2.findViewById(R.id.wifi_storing_indicator);
            viewFindViewById3.getClass();
            bVar.f43371c = (ProgressBar) viewFindViewById3;
            view2.setTag(bVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            bVar = (b) tag;
        }
        k item = getItem(i14);
        item.getClass();
        String str = item.f43320a;
        boolean z14 = item.f43327h == 3;
        TextView textView = bVar.f43369a;
        Context context = this.f43365a;
        if (z14) {
            textView.getClass();
            textView.setText("");
        } else {
            textView.getClass();
            textView.setText(!TextUtils.isEmpty(str) ? str : context.getString(R.string.no_value));
        }
        TextView textView2 = bVar.f43369a;
        textView2.getClass();
        textView2.setTypeface(null, 0);
        int i15 = item.f43327h;
        if (i15 == 2 || i15 == 3) {
            ImageView imageView = bVar.f43370b;
            imageView.getClass();
            imageView.setVisibility(4);
            return view2;
        }
        int i16 = this.f43366b;
        if (i15 != 0) {
            if (i16 != 102) {
                ImageView imageView2 = bVar.f43370b;
                imageView2.getClass();
                imageView2.setVisibility(4);
                return view2;
            }
            if (item.f43321b != k.c.OPEN) {
                c(bVar);
                return view2;
            }
            ImageView imageView3 = bVar.f43370b;
            imageView3.getClass();
            imageView3.setVisibility(4);
            return view2;
        }
        ImageView imageView4 = bVar.f43370b;
        imageView4.getClass();
        imageView4.setImageDrawable(a7.b.getDrawable(context, R.drawable.check));
        ImageView imageView5 = bVar.f43370b;
        imageView5.getClass();
        imageView5.setImageTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_primary_action)));
        HashMap map = this.f43368d;
        if (((map.size() > 0 && (eVar = (e) map.get(str)) != null && eVar.f43296b == item.f43321b) || item.f43325f) && i16 == 102) {
            ImageView imageView6 = bVar.f43370b;
            imageView6.getClass();
            imageView6.setVisibility(0);
            return view2;
        }
        if (item.f43321b != k.c.OPEN && i16 == 102) {
            c(bVar);
            return view2;
        }
        ImageView imageView7 = bVar.f43370b;
        imageView7.getClass();
        imageView7.setVisibility(4);
        return view2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/wifi/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

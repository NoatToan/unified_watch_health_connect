package dz;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.a0;
import b7.g;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends RecyclerView.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f61653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewGroup f61654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f61655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f61656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f61657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public cz.a f61658f;

    /* JADX INFO: renamed from: dz.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC1307a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f61659a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bundle f61660b;

        public ViewOnClickListenerC1307a(int i14) {
            this.f61659a = i14;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view2) {
            cz.a aVar = a.this.f61658f;
            if (aVar != null) {
                aVar.y1(this.f61659a, this.f61660b);
            }
        }
    }

    public a(ViewGroup viewGroup, int i14) {
        super(a0.d(viewGroup, i14, viewGroup, false));
        f(this.itemView);
    }

    public int d(Resources resources) {
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        return resources.getColor(R.color.card_header, null);
    }

    public int e(Resources resources) {
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        return resources.getColor(R.color.gcm_text_primary, null);
    }

    public void f(View view2) {
        this.f61653a = (ViewGroup) view2.findViewById(R.id.card_root_layout);
        this.f61654b = (ViewGroup) view2.findViewById(R.id.card_header);
        this.f61655c = (ImageView) view2.findViewById(R.id.card_header_icon);
        this.f61656d = (TextView) view2.findViewById(R.id.card_header_title);
        this.f61657e = (ImageView) view2.findViewById(R.id.card_header_overview_button);
        Resources resources = view2.getResources();
        this.f61654b.setBackgroundColor(d(resources));
        this.f61656d.setTextColor(e(resources));
        view2.setTag(R.id.view_holder_name, getClass().getName());
    }

    public a(View view2, cz.a aVar) {
        super(view2);
        this.f61658f = aVar;
        f(this.itemView);
    }
}

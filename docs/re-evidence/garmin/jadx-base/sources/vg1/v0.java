package vg1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvg1/v0;", "Lcom/garmin/android/apps/connectmobile/f1;", "Lkotlin/Function0;", "", "selectionChangedListener", "<init>", "(Le23/a;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f178192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f178193d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f178194e = -1;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lvg1/v0$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Lvg1/v0;Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.f0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f178195g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f178196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImageView f178197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f178198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f178199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f178200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final View f178201f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v0 v0Var, View view2) {
            super(view2);
            view2.getClass();
            this.f178196a = view2.getContext();
            this.f178197b = (ImageView) view2.findViewById(R.id.backup_device_image_view);
            this.f178198c = (TextView) view2.findViewById(R.id.backup_last_update_text_view);
            this.f178199d = (TextView) view2.findViewById(R.id.backup_device_name_text_view);
            this.f178200e = (TextView) view2.findViewById(R.id.backup_profiles_text_view);
            this.f178201f = view2.findViewById(R.id.checkmark_icon);
            view2.setOnClickListener(new u12.e(22, this, v0Var));
        }
    }

    public v0(e23.a<Unit> aVar) {
        this.f178192c = aVar;
    }

    public final qv.b A() {
        Object next;
        Iterator it = this.f178193d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((qv.b) next).f147909e) {
                return (qv.b) next;
            }
        }
        next = null;
        return (qv.b) next;
    }

    public final void B(int i14) {
        if (i14 == -1) {
            return;
        }
        ArrayList arrayList = this.f178193d;
        qv.b bVar = (qv.b) arrayList.get(i14);
        boolean z14 = !((qv.b) arrayList.get(i14)).f147909e;
        long j8 = bVar.f147905a;
        String str = bVar.f147906b;
        String str2 = bVar.f147907c;
        List<String> list = bVar.f147908d;
        boolean z15 = bVar.f147910f;
        String str3 = bVar.f147911g;
        list.getClass();
        str3.getClass();
        arrayList.set(i14, new qv.b(j8, str, str2, list, z14, z15, str3));
        notifyItemChanged(this.f34942a.size() + i14);
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f178193d.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        if (i14 == -1) {
            return;
        }
        a aVar = f0Var instanceof a ? (a) f0Var : null;
        if (aVar != null) {
            qv.b bVar = (qv.b) this.f178193d.get(i14);
            View view2 = aVar.f178201f;
            ImageView imageView = aVar.f178197b;
            Context context = aVar.f178196a;
            bVar.getClass();
            String str = bVar.f147907c;
            if (str == null || str.length() == 0) {
                imageView.setImageResource(2131231969);
            } else {
                zp0.c.a aVar2 = zp0.c.f206560v;
                context.getClass();
                aVar2.getClass();
                zp0.c cVar = new zp0.c(context);
                cVar.f206565e = str;
                cVar.f206570j = 2131231969;
                imageView.getClass();
                cVar.h(imageView);
            }
            TextView textView = aVar.f178199d;
            String str2 = bVar.f147906b;
            if (str2 == null) {
                str2 = "";
            }
            textView.setText(str2);
            aVar.f178198c.setText(context.getString(R.string.txt_last_updated, bVar.f147911g));
            aVar.f178200e.setText(p13.h0.k0(bVar.f147908d, ", ", null, null, null, 62));
            if (!bVar.f147910f) {
                view2.getClass();
                view2.setVisibility(8);
            } else if (bVar.f147909e) {
                view2.getClass();
                view2.setVisibility(0);
            } else {
                view2.getClass();
                view2.setVisibility(4);
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        View viewInflate = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(R.layout.activity_profiles_backup_item, viewGroup, false);
        viewInflate.getClass();
        return new a(this, viewInflate);
    }
}

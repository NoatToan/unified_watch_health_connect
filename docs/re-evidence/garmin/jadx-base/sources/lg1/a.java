package lg1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Filter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy;
import d53.w;
import e23.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Objects;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p006l2.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0003\u0010\u0011\u0012BA\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Llg1/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Llg1/a$a;", "Ljava/util/ArrayList;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "Lkotlin/collections/ArrayList;", "prefsList", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lkotlin/Function1;", "", "", "showProgress", "<init>", "(Ljava/util/ArrayList;Le23/a;Le23/l;)V", "a", "b", "c", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<AbstractC2153a<?>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<IDeveloperItemStrategy> f112173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Context> f112174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<Boolean, Unit> f112175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<IDeveloperItemStrategy> f112176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f112177e;

    /* JADX INFO: renamed from: lg1.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llg1/a$a;", "IDeveloperItemStrategy", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC2153a<IDeveloperItemStrategy> extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC2153a(View view2) {
            super(view2);
            view2.getClass();
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112186a;

        static {
            int[] iArr = new int[mg1.b.values().length];
            try {
                iArr[mg1.b.VIEW_TYPE_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mg1.b.VIEW_TYPE_SWITCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112186a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"lg1/a$e", "Landroid/widget/Filter;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends Filter {
        public e() {
        }

        @Override // android.widget.Filter
        public final Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList = new ArrayList();
            a aVar = a.this;
            if (charSequence == null || charSequence.length() == 0) {
                arrayList.addAll(aVar.f112176d);
            } else {
                String lowerCase = w.i0(charSequence.toString()).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                for (IDeveloperItemStrategy iDeveloperItemStrategy : aVar.f112176d) {
                    String lowerCase2 = iDeveloperItemStrategy.getDeveloperItem(aVar.f112174b).f118372b.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    if (w.z(lowerCase2, lowerCase, false)) {
                        arrayList.add(iDeveloperItemStrategy);
                    }
                }
            }
            Filter.FilterResults filterResults = new Filter.FilterResults();
            filterResults.values = arrayList;
            return filterResults;
        }

        @Override // android.widget.Filter
        @SuppressLint({"NotifyDataSetChanged"})
        public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if ((filterResults != null ? filterResults.values : null) instanceof ArrayList) {
                a aVar = a.this;
                aVar.f112173a.clear();
                ArrayList<IDeveloperItemStrategy> arrayList = aVar.f112173a;
                Object obj = filterResults.values;
                obj.getClass();
                arrayList.addAll((Collection) obj);
                Objects.toString(aVar.f112173a);
                aVar.notifyDataSetChanged();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(ArrayList<IDeveloperItemStrategy> arrayList, e23.a<? extends Context> aVar, l<? super Boolean, Unit> lVar) {
        arrayList.getClass();
        aVar.getClass();
        lVar.getClass();
        this.f112173a = arrayList;
        this.f112174b = aVar;
        this.f112175c = lVar;
        ArrayList<IDeveloperItemStrategy> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        this.f112176d = arrayList2;
        this.f112177e = new e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return this.f112173a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return this.f112173a.get(i14).getViewType().f118380a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        AbstractC2153a abstractC2153a = (AbstractC2153a) f0Var;
        abstractC2153a.getClass();
        boolean z14 = abstractC2153a instanceof b;
        ArrayList<IDeveloperItemStrategy> arrayList = this.f112173a;
        if (z14) {
            b bVar = (b) abstractC2153a;
            IDeveloperItemStrategy iDeveloperItemStrategy = arrayList.get(i14);
            iDeveloperItemStrategy.getClass();
            IDeveloperItemStrategy iDeveloperItemStrategy2 = iDeveloperItemStrategy;
            mg1.a developerItem = iDeveloperItemStrategy2.getDeveloperItem(new v0(bVar, 8));
            bVar.f112180b.b(developerItem.f118372b, developerItem.f118373c);
            bVar.f112179a.setOnClickListener(new lg1.b(iDeveloperItemStrategy2, bVar, developerItem, i14, 0));
            return;
        }
        if (abstractC2153a instanceof c) {
            c cVar = (c) abstractC2153a;
            IDeveloperItemStrategy iDeveloperItemStrategy3 = arrayList.get(i14);
            iDeveloperItemStrategy3.getClass();
            IDeveloperItemStrategy iDeveloperItemStrategy4 = iDeveloperItemStrategy3;
            mg1.a developerItem2 = iDeveloperItemStrategy4.getDeveloperItem(new v0(cVar, 9));
            View view2 = cVar.f112184a;
            SwitchCompat switchCompat = (SwitchCompat) view2.findViewById(R.id.switch_right);
            switchCompat.setVisibility(0);
            switchCompat.setEnabled(developerItem2.f118374d);
            switchCompat.setChecked(developerItem2.f118375e);
            switchCompat.setOnCheckedChangeListener(new lg1.c(iDeveloperItemStrategy4, 0, cVar, developerItem2));
            ((TextView) view2.findViewById(R.id.label_top)).setText(developerItem2.f118372b);
            TextView textView = (TextView) view2.findViewById(R.id.label_bottom);
            textView.setVisibility(0);
            textView.setText(developerItem2.f118373c);
            textView.setSingleLine(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        mg1.b bVar;
        viewGroup.getClass();
        kp2.a aVar = new kp2.a(this, 7);
        mg1.b.f118376b.getClass();
        mg1.b[] bVarArrValues = mg1.b.values();
        int length = bVarArrValues.length;
        int i15 = 0;
        while (true) {
            if (i15 >= length) {
                bVar = null;
                break;
            }
            bVar = bVarArrValues[i15];
            if (bVar.f118380a == i14) {
                break;
            }
            i15++;
        }
        if (bVar == null) {
            bVar = mg1.b.VIEW_TYPE_BUTTON;
        }
        int i16 = d.f112186a[bVar.ordinal()];
        l<Boolean, Unit> lVar = this.f112175c;
        if (i16 == 1) {
            b.f112178e.getClass();
            lVar.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_row_item, viewGroup, false);
            viewInflate.getClass();
            return new b(viewInflate, new k32.l(viewInflate), aVar, lVar);
        }
        if (i16 != 2) {
            u0.r();
            return null;
        }
        c.f112183c.getClass();
        lVar.getClass();
        View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gcm_complex_two_line_button_3_0, viewGroup, false);
        ViewParent parent = ((TextView) viewInflate2.findViewById(R.id.label_bottom)).getParent();
        parent.getClass();
        LinearLayout linearLayout = (LinearLayout) parent;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.getClass();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(16, ((SwitchCompat) viewInflate2.findViewById(R.id.switch_right)).getId());
        linearLayout.setLayoutParams(layoutParams2);
        return new c(viewInflate2, lVar);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Llg1/a$b;", "Llg1/a$a;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "Landroid/view/View;", "view", "Lk32/l;", "rowItem", "Lkotlin/Function1;", "", "", "notifyChange", "", "showProgress", "<init>", "(Landroid/view/View;Lk32/l;Le23/l;Le23/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends AbstractC2153a<IDeveloperItemStrategy> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C2154a f112178e = new C2154a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f112179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k32.l f112180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l<Integer, Unit> f112181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l<Boolean, Unit> f112182d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(View view2, k32.l lVar, l<? super Integer, Unit> lVar2, l<? super Boolean, Unit> lVar3) {
            super(view2);
            view2.getClass();
            lVar.getClass();
            lVar2.getClass();
            lVar3.getClass();
            this.f112179a = view2;
            this.f112180b = lVar;
            this.f112181c = lVar2;
            this.f112182d = lVar3;
        }

        /* JADX INFO: renamed from: lg1.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llg1/a$b$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2154a {
            public /* synthetic */ C2154a(j jVar) {
                this();
            }

            private C2154a() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Llg1/a$c;", "Llg1/a$a;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "", "showProgress", "<init>", "(Landroid/view/View;Le23/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends AbstractC2153a<IDeveloperItemStrategy> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C2155a f112183c = new C2155a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f112184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l<Boolean, Unit> f112185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(View view2, l<? super Boolean, Unit> lVar) {
            super(view2);
            view2.getClass();
            lVar.getClass();
            this.f112184a = view2;
            this.f112185b = lVar;
        }

        /* JADX INFO: renamed from: lg1.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llg1/a$c$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C2155a {
            public /* synthetic */ C2155a(j jVar) {
                this();
            }

            private C2155a() {
            }
        }
    }
}

package so2;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardActivity;
import java.util.ArrayList;
import java.util.List;
import o72.t;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import pm0.h;
import po2.s;
import yr2.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lso2/f;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "b", "a", "c", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f160487b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f160488c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SnowballAddCardActivity.i f160489a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lso2/f$a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Lso2/f$b;", "", "Lpo2/s;", "cards", "<init>", "(Lso2/f;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a extends RecyclerView.h<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<s> f160490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f160491b;

        public a(f fVar, List<s> list) {
            list.getClass();
            this.f160491b = fVar;
            this.f160490a = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final int getItemCount() {
            return this.f160490a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            b bVar = (b) f0Var;
            bVar.getClass();
            s sVar = this.f160490a.get(i14);
            j.b(bVar.f160492a, sVar.f139373b, 10, 4);
            bVar.f160493b.setText(sVar.f139372a);
            bVar.f160494c.setText(ko2.c.f105778b.a(Double.valueOf(sVar.f139375d)));
            bVar.itemView.setOnClickListener(new h(19, this.f160491b, sVar));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            return new b(n23.j.b(viewGroup, R.layout.item_snowball_shift_in_card, viewGroup, false));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lso2/f$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f160492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f160493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f160494c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = this.itemView.findViewById(R.id.card_item_image_small);
            viewFindViewById.getClass();
            this.f160492a = (ImageView) viewFindViewById;
            View viewFindViewById2 = this.itemView.findViewById(R.id.card_item_name);
            viewFindViewById2.getClass();
            this.f160493b = (TextView) viewFindViewById2;
            View viewFindViewById3 = this.itemView.findViewById(R.id.card_item_info);
            viewFindViewById3.getClass();
            this.f160494c = (TextView) viewFindViewById3;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f160488c = gt2.b.f79005a.h("PAY#SB#ShiftInFrag");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_snowball_shift_in, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f160489a = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        String string;
        view2.getClass();
        hn2.c cVarF = t.F(this);
        Logger logger = f160488c;
        if (cVarF == null) {
            logger.error("Failed to cast activity to GarminPayBaseActivity");
            return;
        }
        String string2 = cVarF.getString(R.string.wallet_shift_in_card_title);
        string2.getClass();
        cVarF.W9(string2, hn2.c.a.BACK);
        cVarF.X9(true);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("extra.card_name")) == null) {
            logger.error("Cannot get card name");
            return;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? arguments2.getParcelableArrayList("extra.cards_to_shift_in", s.class) : arguments2.getParcelableArrayList("extra.cards_to_shift_in");
            if (parcelableArrayList != null) {
                View viewFindViewById = view2.findViewById(R.id.card_shift_in_message);
                viewFindViewById.getClass();
                ((TextView) viewFindViewById).setText(getString(R.string.wallet_shift_in_card_hint, string));
                View viewFindViewById2 = view2.findViewById(R.id.card_list_to_shift_in);
                viewFindViewById2.getClass();
                ((RecyclerView) viewFindViewById2).setAdapter(new a(this, parcelableArrayList));
                return;
            }
        }
        logger.error("Cannot get cards to shift in");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lso2/f$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "EXTRA_CARD_NAME", "EXTRA_CARDS_TO_SHIFT_IN", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private c() {
        }
    }
}

package sw0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsw0/c;", "Lsw0/a;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "a", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends sw0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f161071a;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view2) {
        super(view2);
        view2.getClass();
        this.f161071a = view2.getContext();
    }

    @Override // sw0.a
    public final void d(k kVar) {
        kVar.getClass();
        TextView textView = (TextView) this.itemView.findViewById(R.id.cat4_and_easier);
        textView.setText(textView.getContext().getString(R.string.lbl_climb_cat4_and_easier));
        textView.setContentDescription(textView.getContext().getString(R.string.lbl_climb_category4_and_easier));
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.cat3);
        textView2.setText(textView2.getContext().getString(R.string.lbl_abbreviated_category, "3"));
        textView2.setContentDescription(textView2.getContext().getString(R.string.lbl_category_number, "3"));
        TextView textView3 = (TextView) this.itemView.findViewById(R.id.cat2);
        textView3.setText(textView3.getContext().getString(R.string.lbl_abbreviated_category, "2"));
        textView3.setContentDescription(textView3.getContext().getString(R.string.lbl_category_number, "2"));
        TextView textView4 = (TextView) this.itemView.findViewById(R.id.cat1);
        textView4.setText(textView4.getContext().getString(R.string.lbl_abbreviated_category, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        textView4.setContentDescription(textView4.getContext().getString(R.string.lbl_category_number, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE));
        ((TextView) this.itemView.findViewById(R.id.horse_cat_tv)).setText(this.f161071a.getString(R.string.lbl_horse_cat));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lsw0/c$a;", "", "<init>", "()V", "", "CLIMB_CAT_1", "Ljava/lang/String;", "CLIMB_CAT_2", "CLIMB_CAT_3", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

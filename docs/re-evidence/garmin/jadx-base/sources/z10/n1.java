package z10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lz10/n1;", "Landroid/widget/ArrayAdapter;", "Ld20/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "textViewResourceId", "", "objects", "<init>", "(Landroid/content/Context;I[Ld20/b;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n1 extends ArrayAdapter<d20.b> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz10/n1$a;", "", "<init>", "(Lz10/n1;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f201173a;

        public a(n1 n1Var) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(Context context, int i14, d20.b[] bVarArr) {
        super(context, i14, bVarArr);
        context.getClass();
        bVarArr.getClass();
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i14, View view2, ViewGroup viewGroup) {
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.spinner_dropdown_item_layout, viewGroup, false);
        d20.b item = getItem(i14);
        if (item != null) {
            ((TextView) viewInflate.findViewById(android.R.id.text1)).setText(item.getFriendlyName());
        }
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        View viewInflate;
        a aVar;
        TextView textView;
        viewGroup.getClass();
        if (view2 == null) {
            aVar = new a(this);
            viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.rectangle_border_text_view, viewGroup, false);
            aVar.f201173a = viewInflate != null ? (TextView) viewInflate.findViewById(android.R.id.text1) : null;
            if (viewInflate != null) {
                viewInflate.setTag(aVar);
            }
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            a aVar2 = (a) tag;
            viewInflate = view2;
            aVar = aVar2;
        }
        d20.b item = getItem(i14);
        if (item != null && (textView = aVar.f201173a) != null) {
            textView.setText(item.getFriendlyName());
        }
        viewInflate.getClass();
        return viewInflate;
    }
}

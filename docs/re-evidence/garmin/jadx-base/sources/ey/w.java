package ey;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ley/w;", "Landroid/widget/ArrayAdapter;", "Lxx/a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "textViewResourceId", "", "objects", "<init>", "(Landroid/content/Context;ILjava/util/List;)V", "a", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends ArrayAdapter<xx.a> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ley/w$a;", "", "<init>", "(Ley/w;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f67122a;

        public a(w wVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, int i14, List<xx.a> list) {
        super(context, i14, list);
        context.getClass();
        list.getClass();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        View viewInflate;
        a aVar;
        viewGroup.getClass();
        if (view2 == null) {
            aVar = new a(this);
            Object systemService = getContext().getSystemService("layout_inflater");
            systemService.getClass();
            viewInflate = ((LayoutInflater) systemService).inflate(R.layout.weekday_textview, viewGroup, false);
            viewInflate.getClass();
            View viewFindViewById = viewInflate.findViewById(R.id.calendar_week_day_label);
            viewFindViewById.getClass();
            TextView textView = (TextView) viewFindViewById;
            aVar.f67122a = textView;
            v22.d.a(textView, 1.3f);
            viewInflate.setTag(aVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            a aVar2 = (a) tag;
            viewInflate = view2;
            aVar = aVar2;
        }
        xx.a item = getItem(i14);
        TextView textView2 = aVar.f67122a;
        if (textView2 != null) {
            textView2.setText(item != null ? item.f192464a : null);
        }
        TextView textView3 = aVar.f67122a;
        if (textView3 != null) {
            textView3.setContentDescription(item != null ? item.f192465b : null);
        }
        TextView textView4 = aVar.f67122a;
        if (textView4 != null) {
            textView4.setGravity(17);
        }
        return viewInflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i14) {
        return false;
    }
}

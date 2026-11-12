package do1;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\u0007B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ldo1/c;", "Landroid/widget/ArrayAdapter;", "Lmo1/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends ArrayAdapter<mo1.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayoutInflater f60590a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldo1/c$a;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TextView f60591a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context, R.layout.gcm_like_list_item_3_0);
        context.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        layoutInflaterFrom.getClass();
        this.f60590a = layoutInflaterFrom;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i14, View view2, ViewGroup viewGroup) {
        a aVar;
        viewGroup.getClass();
        mo1.b item = getItem(i14);
        if (view2 == null) {
            view2 = this.f60590a.inflate(R.layout.gcm_like_list_item_3_0, viewGroup, false);
            aVar = new a();
            View viewFindViewById = view2.findViewById(R.id.like_display_name);
            viewFindViewById.getClass();
            aVar.f60591a = (TextView) viewFindViewById;
            view2.setTag(aVar);
        } else {
            Object tag = view2.getTag();
            tag.getClass();
            aVar = (a) tag;
        }
        TextView textView = aVar.f60591a;
        textView.getClass();
        item.getClass();
        textView.setText(!TextUtils.isEmpty(item.getFullName()) ? item.getFullName() : item.getDisplayName());
        return view2;
    }
}

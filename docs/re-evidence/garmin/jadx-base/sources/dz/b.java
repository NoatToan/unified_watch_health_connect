package dz;

import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import b7.g;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f61662g;

    public b(ViewGroup viewGroup) {
        super(viewGroup, R.layout.statistic_card);
    }

    @Override // dz.a
    public void f(View view2) {
        super.f(view2);
        this.f61662g = (TextView) view2.findViewById(R.id.card_header_privacy);
        ViewStub viewStub = (ViewStub) view2.findViewById(R.id.card_details);
        viewStub.setLayoutResource(g());
        View viewInflate = viewStub.inflate();
        Resources resources = view2.getResources();
        ThreadLocal<TypedValue> threadLocal = g.f16255a;
        viewInflate.setBackgroundColor(resources.getColor(R.color.card_content, null));
    }

    public abstract int g();
}

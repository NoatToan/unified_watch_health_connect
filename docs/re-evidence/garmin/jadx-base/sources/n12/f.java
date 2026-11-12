package n12;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mt0.b2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.l<Boolean, Unit> {
    public f(Object obj) {
        super(1, obj, EditProfileImageActivity.class, "updateViewPager", "updateViewPager(Z)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        EditProfileImageActivity editProfileImageActivity = (EditProfileImageActivity) this.receiver;
        ViewPager2 viewPager2 = editProfileImageActivity.f46580d;
        if (viewPager2 == null) {
            p005kotlin.jvm.internal.s.m("viewPager");
            throw null;
        }
        RecyclerView.h adapter = viewPager2.getAdapter();
        w wVar = adapter instanceof w ? (w) adapter : null;
        if (wVar == null || wVar.f122333j != zBooleanValue) {
            ViewPager2 viewPager3 = editProfileImageActivity.f46580d;
            if (viewPager3 == null) {
                p005kotlin.jvm.internal.s.m("viewPager");
                throw null;
            }
            viewPager3.setOffscreenPageLimit(2);
            ViewPager2 viewPager4 = editProfileImageActivity.f46580d;
            if (viewPager4 == null) {
                p005kotlin.jvm.internal.s.m("viewPager");
                throw null;
            }
            viewPager4.setUserInputEnabled(false);
            w wVar2 = new w(editProfileImageActivity, zBooleanValue);
            ViewPager2 viewPager5 = editProfileImageActivity.f46580d;
            if (viewPager5 == null) {
                p005kotlin.jvm.internal.s.m("viewPager");
                throw null;
            }
            viewPager5.setAdapter(wVar2);
            List<w.a> list = wVar2.f122334k;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(editProfileImageActivity.getString(((w.a) it.next()).a()));
            }
            i53.f fVarJ = i53.a.j(arrayList);
            int size = fVarJ.size();
            TabLayout tabLayout = editProfileImageActivity.f46581e;
            if (size > 1) {
                if (tabLayout == null) {
                    p005kotlin.jvm.internal.s.m("tabLayout");
                    throw null;
                }
                tabLayout.setVisibility(0);
                TabLayoutMediator tabLayoutMediator = editProfileImageActivity.f46582f;
                if (tabLayoutMediator != null) {
                    tabLayoutMediator.detach();
                }
                TabLayout tabLayout2 = editProfileImageActivity.f46581e;
                if (tabLayout2 == null) {
                    p005kotlin.jvm.internal.s.m("tabLayout");
                    throw null;
                }
                ViewPager2 viewPager6 = editProfileImageActivity.f46580d;
                if (viewPager6 == null) {
                    p005kotlin.jvm.internal.s.m("viewPager");
                    throw null;
                }
                TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(tabLayout2, viewPager6, new b2(fVarJ, 5));
                editProfileImageActivity.f46582f = tabLayoutMediator2;
                tabLayoutMediator2.attach();
                if (editProfileImageActivity.getIntent().getBooleanExtra("START_WITH_FRAME", false)) {
                    ViewPager2 viewPager7 = editProfileImageActivity.f46580d;
                    if (viewPager7 == null) {
                        p005kotlin.jvm.internal.s.m("viewPager");
                        throw null;
                    }
                    viewPager7.c(1, false);
                }
            } else {
                if (tabLayout == null) {
                    p005kotlin.jvm.internal.s.m("tabLayout");
                    throw null;
                }
                tabLayout.setVisibility(8);
                TabLayoutMediator tabLayoutMediator3 = editProfileImageActivity.f46582f;
                if (tabLayoutMediator3 != null) {
                    tabLayoutMediator3.detach();
                }
            }
        }
        return Unit.INSTANCE;
    }
}

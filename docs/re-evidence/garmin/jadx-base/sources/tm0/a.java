package tm0;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.daasuu.bl.BubbleLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.draggableimagepreviewer.DraggableImagePreviewer;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f165346b;

    public /* synthetic */ a(c cVar, int i14) {
        this.f165345a = i14;
        this.f165346b = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f165345a;
        c cVar = this.f165346b;
        switch (i14) {
            case 0:
                g3 g3Var = (g3) obj;
                int i15 = c.f165349i;
                g3Var.getClass();
                int i16 = c.b.f165358a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    View view2 = cVar.f165354e;
                    if (view2 == null) {
                        s.m("progressView");
                        throw null;
                    }
                    v22.e.j(view2);
                    ht.a aVar = ht.a.f85464a;
                    Bundle bundle = new Bundle();
                    aVar.getClass();
                    ht.a.a(bundle, "GroupPostSubmitted");
                    androidx.fragment.app.m mVarRequireActivity = cVar.requireActivity();
                    CreatePostActivity createPostActivity = mVarRequireActivity instanceof CreatePostActivity ? (CreatePostActivity) mVarRequireActivity : null;
                    if (createPostActivity != null) {
                        jo1.e eVar = (jo1.e) g3Var.f35301b;
                        if (eVar != null) {
                            Intent intent = new Intent();
                            intent.putExtra("NewsPostDTO", eVar);
                            createPostActivity.setResult(-1, intent);
                        } else {
                            createPostActivity.setResult(0);
                        }
                        createPostActivity.finish();
                        createPostActivity.overridePendingTransition(0, R.anim.exit_out_down);
                    }
                } else if (i16 == 2) {
                    View view3 = cVar.f165354e;
                    if (view3 == null) {
                        s.m("progressView");
                        throw null;
                    }
                    v22.e.j(view3);
                    String string = cVar.getString(R.string.social_post_submit_post_error_message);
                    string.getClass();
                    cVar.y6(string, true);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    cVar.w6();
                }
                return Unit.INSTANCE;
            case 1:
                int i17 = c.f165349i;
                ((g3) obj).getClass();
                cVar.v6();
                return Unit.INSTANCE;
            default:
                List list = (List) obj;
                DraggableImagePreviewer draggableImagePreviewer = cVar.f165352c;
                if (draggableImagePreviewer == null) {
                    s.m("photoPicker");
                    throw null;
                }
                list.getClass();
                com.garmin.android.apps.connectmobile.draggableimagepreviewer.a aVar2 = draggableImagePreviewer.f34728a;
                aVar2.getClass();
                ArrayList arrayList = aVar2.f34731b;
                int size = arrayList.size();
                arrayList.addAll(list);
                aVar2.notifyItemRangeInserted(size, list.size());
                ef0.d dVar = aVar2.f34733d;
                if (dVar != null) {
                    dVar.a(h0.b1(arrayList));
                }
                DraggableImagePreviewer draggableImagePreviewer2 = cVar.f165352c;
                if (draggableImagePreviewer2 == null) {
                    s.m("photoPicker");
                    throw null;
                }
                v22.e.r(draggableImagePreviewer2, draggableImagePreviewer2.f34728a.f34731b.size() > 0);
                BubbleLayout bubbleLayout = cVar.f165355f;
                if (bubbleLayout != null) {
                    String string2 = cVar.requireContext().getString(R.string.key_tooltip_drag_to_reorder);
                    string2.getClass();
                    g22.o.a(bubbleLayout, string2);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    cVar.z6((ef0.b) it.next());
                }
                return Unit.INSTANCE;
        }
    }
}

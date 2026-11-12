package tm0;

import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.n0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.draggableimagepreviewer.DraggableImagePreviewer;
import com.garmin.android.apps.connectmobile.group.details.feed.create.CreatePostActivity;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f165348b;

    public /* synthetic */ b(c cVar, int i14) {
        this.f165347a = i14;
        this.f165348b = cVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f165347a;
        c cVar = this.f165348b;
        switch (i15) {
            case 0:
                int i16 = c.f165349i;
                dialogInterface.dismiss();
                cVar.w6();
                DraggableImagePreviewer draggableImagePreviewer = cVar.f165352c;
                if (draggableImagePreviewer == null) {
                    s.m("photoPicker");
                    throw null;
                }
                List<ef0.b> imageItems = draggableImagePreviewer.getImageItems();
                ArrayList arrayList = new ArrayList();
                for (Object obj : imageItems) {
                    if (((ef0.b) obj).f63940b != ef0.e.SUCCESS) {
                        arrayList.add(obj);
                    }
                }
                l lVar = (l) cVar.f165350a.getValue();
                Context contextRequireContext = cVar.requireContext();
                contextRequireContext.getClass();
                androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new p(arrayList, lVar, contextRequireContext, null), 3);
                n0 viewLifecycleOwner = cVar.getViewLifecycleOwner();
                viewLifecycleOwner.getClass();
                dh.b.L(jVarA, viewLifecycleOwner, new c.d(new a(cVar, 1)));
                return;
            default:
                int i17 = c.f165349i;
                androidx.fragment.app.m mVarRequireActivity = cVar.requireActivity();
                CreatePostActivity createPostActivity = mVarRequireActivity instanceof CreatePostActivity ? (CreatePostActivity) mVarRequireActivity : null;
                if (createPostActivity != null) {
                    createPostActivity.setResult(0);
                    createPostActivity.finish();
                    createPostActivity.overridePendingTransition(0, R.anim.exit_out_down);
                    return;
                }
                return;
        }
    }
}

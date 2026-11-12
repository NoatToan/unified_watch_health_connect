package go1;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.social.conversationservice.model.ConversationCommentDTO;
import com.garmin.android.apps.connectmobile.tag.TaggableEditText;
import com.garmin.android.apps.connectmobile.view.view_3_0.PostCommentView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lgo1/r;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f78297l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f78298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f78299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f78300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f78301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f78302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f78303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f78304g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f78305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f78306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f78307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f78308k;

    @Override // androidx.fragment.app.i, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        ConversationCommentDTO conversationCommentDTO;
        Parcelable parcelable;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f78298a = arguments != null ? Integer.valueOf(arguments.getInt("ADAPTER_POSITION")) : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments2.getParcelable("CONVERSATION_COMMENT_DTO", ConversationCommentDTO.class);
            } else {
                Parcelable parcelable2 = arguments2.getParcelable("CONVERSATION_COMMENT_DTO");
                if (!(parcelable2 instanceof ConversationCommentDTO)) {
                    parcelable2 = null;
                }
                parcelable = (ConversationCommentDTO) parcelable2;
            }
            conversationCommentDTO = (ConversationCommentDTO) parcelable;
        } else {
            conversationCommentDTO = null;
        }
        this.f78299b = conversationCommentDTO != null ? conversationCommentDTO.f44555j : null;
        this.f78300c = conversationCommentDTO != null ? conversationCommentDTO.f44547b : null;
        this.f78301d = conversationCommentDTO != null ? conversationCommentDTO.f44546a : null;
        this.f78302e = conversationCommentDTO != null ? conversationCommentDTO.f44548c : null;
        this.f78305h = p005kotlin.jvm.internal.s.g(conversationCommentDTO != null ? conversationCommentDTO.f44550e : null, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName());
        Bundle arguments3 = getArguments();
        this.f78303f = arguments3 != null ? arguments3.getBoolean("IS_DELETABLE") : false;
        Bundle arguments4 = getArguments();
        this.f78304g = arguments4 != null ? arguments4.getBoolean("IS_EDITABLE") : false;
        if (this.f78300c == null || this.f78301d == null || this.f78302e == null) {
            this.f78303f = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.comment_action_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.comment_edit);
        viewFindViewById.getClass();
        TextView textView = (TextView) viewFindViewById;
        this.f78306i = textView;
        v22.e.r(textView, this.f78305h && this.f78304g);
        TextView textView2 = this.f78306i;
        if (textView2 == null) {
            p005kotlin.jvm.internal.s.m("editView");
            throw null;
        }
        final int i14 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: go1.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f78296b;

            {
                this.f78296b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                View viewFindViewByPosition;
                TaggableEditText taggableEditText;
                k kVar;
                String str;
                String str2;
                switch (i14) {
                    case 0:
                        r rVar = this.f78296b;
                        Integer num = rVar.f78298a;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            k kVar2 = rVar.f78308k;
                            if (kVar2 != null) {
                                kVar2.f78267q = iIntValue;
                                c0 c0VarY6 = kVar2.y6();
                                ArrayList arrayList = c0VarY6.f78226h;
                                w.c cVar = ((w) arrayList.get(iIntValue)).f78315e;
                                u22.a aVar = u22.a.EditFocusCell;
                                cVar.getClass();
                                aVar.getClass();
                                cVar.f78320e = aVar;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                int i15 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i16 = i15 + 1;
                                        if (i15 < 0) {
                                            p13.x.q();
                                            throw null;
                                        }
                                        if (iIntValue != i15) {
                                            arrayList2.add(next);
                                        }
                                        i15 = i16;
                                    } else {
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            w.c cVar2 = ((w) it3.next()).f78315e;
                                            u22.a aVar2 = u22.a.EditBackgroundCell;
                                            cVar2.getClass();
                                            aVar2.getClass();
                                            cVar2.f78320e = aVar2;
                                        }
                                        c0VarY6.notifyItemRangeChanged(0, c0VarY6.f78226h.size(), new t());
                                        PostCommentView postCommentView = kVar2.f78259i;
                                        if (postCommentView == null) {
                                            p005kotlin.jvm.internal.s.m("postCommentView");
                                            throw null;
                                        }
                                        postCommentView.j();
                                        SwipeRefreshLayout swipeRefreshLayout = kVar2.f78255e;
                                        if (swipeRefreshLayout == null) {
                                            p005kotlin.jvm.internal.s.m("swipeRefreshLayout");
                                            throw null;
                                        }
                                        swipeRefreshLayout.setEnabled(false);
                                        kVar2.f78266p = true;
                                        RecyclerView.p layoutManager = kVar2.A6().getLayoutManager();
                                        if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(iIntValue)) != null && (taggableEditText = (TaggableEditText) viewFindViewByPosition.findViewById(R.id.comment_edit_text)) != null) {
                                            taggableEditText.requestFocus();
                                            Object systemService = kVar2.requireContext().getSystemService("input_method");
                                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                                            if (inputMethodManager != null) {
                                                inputMethodManager.showSoftInput(taggableEditText, 2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        rVar.dismiss();
                        return;
                    case 1:
                        r rVar2 = this.f78296b;
                        String str3 = rVar2.f78299b;
                        if (str3 != null && (kVar = rVar2.f78308k) != null) {
                            Object systemService2 = kVar.requireContext().getSystemService("clipboard");
                            systemService2.getClass();
                            ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(kVar.getString(R.string.lbl_comment), str3));
                        }
                        rVar2.dismiss();
                        return;
                    default:
                        r rVar3 = this.f78296b;
                        Integer num2 = rVar3.f78298a;
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            String str4 = rVar3.f78300c;
                            if (str4 == null || (str = rVar3.f78301d) == null || (str2 = rVar3.f78302e) == null) {
                                return;
                            }
                            k kVar3 = rVar3.f78308k;
                            if (kVar3 != null) {
                                kVar3.G6(iIntValue2, str4, str, str2);
                            }
                            rVar3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        View viewFindViewById2 = view2.findViewById(R.id.comment_copy);
        viewFindViewById2.getClass();
        final int i15 = 1;
        ((TextView) viewFindViewById2).setOnClickListener(new View.OnClickListener(this) { // from class: go1.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f78296b;

            {
                this.f78296b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                View viewFindViewByPosition;
                TaggableEditText taggableEditText;
                k kVar;
                String str;
                String str2;
                switch (i15) {
                    case 0:
                        r rVar = this.f78296b;
                        Integer num = rVar.f78298a;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            k kVar2 = rVar.f78308k;
                            if (kVar2 != null) {
                                kVar2.f78267q = iIntValue;
                                c0 c0VarY6 = kVar2.y6();
                                ArrayList arrayList = c0VarY6.f78226h;
                                w.c cVar = ((w) arrayList.get(iIntValue)).f78315e;
                                u22.a aVar = u22.a.EditFocusCell;
                                cVar.getClass();
                                aVar.getClass();
                                cVar.f78320e = aVar;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                int i16 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i17 = i16 + 1;
                                        if (i16 < 0) {
                                            p13.x.q();
                                            throw null;
                                        }
                                        if (iIntValue != i16) {
                                            arrayList2.add(next);
                                        }
                                        i16 = i17;
                                    } else {
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            w.c cVar2 = ((w) it3.next()).f78315e;
                                            u22.a aVar2 = u22.a.EditBackgroundCell;
                                            cVar2.getClass();
                                            aVar2.getClass();
                                            cVar2.f78320e = aVar2;
                                        }
                                        c0VarY6.notifyItemRangeChanged(0, c0VarY6.f78226h.size(), new t());
                                        PostCommentView postCommentView = kVar2.f78259i;
                                        if (postCommentView == null) {
                                            p005kotlin.jvm.internal.s.m("postCommentView");
                                            throw null;
                                        }
                                        postCommentView.j();
                                        SwipeRefreshLayout swipeRefreshLayout = kVar2.f78255e;
                                        if (swipeRefreshLayout == null) {
                                            p005kotlin.jvm.internal.s.m("swipeRefreshLayout");
                                            throw null;
                                        }
                                        swipeRefreshLayout.setEnabled(false);
                                        kVar2.f78266p = true;
                                        RecyclerView.p layoutManager = kVar2.A6().getLayoutManager();
                                        if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(iIntValue)) != null && (taggableEditText = (TaggableEditText) viewFindViewByPosition.findViewById(R.id.comment_edit_text)) != null) {
                                            taggableEditText.requestFocus();
                                            Object systemService = kVar2.requireContext().getSystemService("input_method");
                                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                                            if (inputMethodManager != null) {
                                                inputMethodManager.showSoftInput(taggableEditText, 2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        rVar.dismiss();
                        return;
                    case 1:
                        r rVar2 = this.f78296b;
                        String str3 = rVar2.f78299b;
                        if (str3 != null && (kVar = rVar2.f78308k) != null) {
                            Object systemService2 = kVar.requireContext().getSystemService("clipboard");
                            systemService2.getClass();
                            ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(kVar.getString(R.string.lbl_comment), str3));
                        }
                        rVar2.dismiss();
                        return;
                    default:
                        r rVar3 = this.f78296b;
                        Integer num2 = rVar3.f78298a;
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            String str4 = rVar3.f78300c;
                            if (str4 == null || (str = rVar3.f78301d) == null || (str2 = rVar3.f78302e) == null) {
                                return;
                            }
                            k kVar3 = rVar3.f78308k;
                            if (kVar3 != null) {
                                kVar3.G6(iIntValue2, str4, str, str2);
                            }
                            rVar3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
        View viewFindViewById3 = view2.findViewById(R.id.comment_delete);
        viewFindViewById3.getClass();
        TextView textView3 = (TextView) viewFindViewById3;
        this.f78307j = textView3;
        v22.e.r(textView3, this.f78303f);
        TextView textView4 = this.f78307j;
        if (textView4 == null) {
            p005kotlin.jvm.internal.s.m("deleteView");
            throw null;
        }
        final int i16 = 2;
        textView4.setOnClickListener(new View.OnClickListener(this) { // from class: go1.q

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f78296b;

            {
                this.f78296b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                View viewFindViewByPosition;
                TaggableEditText taggableEditText;
                k kVar;
                String str;
                String str2;
                switch (i16) {
                    case 0:
                        r rVar = this.f78296b;
                        Integer num = rVar.f78298a;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            k kVar2 = rVar.f78308k;
                            if (kVar2 != null) {
                                kVar2.f78267q = iIntValue;
                                c0 c0VarY6 = kVar2.y6();
                                ArrayList arrayList = c0VarY6.f78226h;
                                w.c cVar = ((w) arrayList.get(iIntValue)).f78315e;
                                u22.a aVar = u22.a.EditFocusCell;
                                cVar.getClass();
                                aVar.getClass();
                                cVar.f78320e = aVar;
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                int i17 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        Object next = it.next();
                                        int i18 = i17 + 1;
                                        if (i17 < 0) {
                                            p13.x.q();
                                            throw null;
                                        }
                                        if (iIntValue != i17) {
                                            arrayList2.add(next);
                                        }
                                        i17 = i18;
                                    } else {
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            w.c cVar2 = ((w) it3.next()).f78315e;
                                            u22.a aVar2 = u22.a.EditBackgroundCell;
                                            cVar2.getClass();
                                            aVar2.getClass();
                                            cVar2.f78320e = aVar2;
                                        }
                                        c0VarY6.notifyItemRangeChanged(0, c0VarY6.f78226h.size(), new t());
                                        PostCommentView postCommentView = kVar2.f78259i;
                                        if (postCommentView == null) {
                                            p005kotlin.jvm.internal.s.m("postCommentView");
                                            throw null;
                                        }
                                        postCommentView.j();
                                        SwipeRefreshLayout swipeRefreshLayout = kVar2.f78255e;
                                        if (swipeRefreshLayout == null) {
                                            p005kotlin.jvm.internal.s.m("swipeRefreshLayout");
                                            throw null;
                                        }
                                        swipeRefreshLayout.setEnabled(false);
                                        kVar2.f78266p = true;
                                        RecyclerView.p layoutManager = kVar2.A6().getLayoutManager();
                                        if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(iIntValue)) != null && (taggableEditText = (TaggableEditText) viewFindViewByPosition.findViewById(R.id.comment_edit_text)) != null) {
                                            taggableEditText.requestFocus();
                                            Object systemService = kVar2.requireContext().getSystemService("input_method");
                                            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                                            if (inputMethodManager != null) {
                                                inputMethodManager.showSoftInput(taggableEditText, 2);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        rVar.dismiss();
                        return;
                    case 1:
                        r rVar2 = this.f78296b;
                        String str3 = rVar2.f78299b;
                        if (str3 != null && (kVar = rVar2.f78308k) != null) {
                            Object systemService2 = kVar.requireContext().getSystemService("clipboard");
                            systemService2.getClass();
                            ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText(kVar.getString(R.string.lbl_comment), str3));
                        }
                        rVar2.dismiss();
                        return;
                    default:
                        r rVar3 = this.f78296b;
                        Integer num2 = rVar3.f78298a;
                        if (num2 != null) {
                            int iIntValue2 = num2.intValue();
                            String str4 = rVar3.f78300c;
                            if (str4 == null || (str = rVar3.f78301d) == null || (str2 = rVar3.f78302e) == null) {
                                return;
                            }
                            k kVar3 = rVar3.f78308k;
                            if (kVar3 != null) {
                                kVar3.G6(iIntValue2, str4, str, str2);
                            }
                            rVar3.dismiss();
                            return;
                        }
                        return;
                }
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lgo1/r$a;", "", "<init>", "()V", "", "ADAPTER_POSITION", "Ljava/lang/String;", "CONVERSATION_COMMENT_DTO", "IS_DELETABLE", "IS_EDITABLE", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

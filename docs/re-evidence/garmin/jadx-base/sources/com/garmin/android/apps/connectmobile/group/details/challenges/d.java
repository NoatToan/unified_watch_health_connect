package com.garmin.android.apps.connectmobile.group.details.challenges;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupChallengeDTO;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.f1;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.ArrayList;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/d;", "Lcom/garmin/android/apps/connectmobile/f1;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$c;", "challengeClickListener", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$i;", "groupChallengeEmptyStateClickListener", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;", "groupDTO", "<init>", "(Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$c;Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$i;Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO;)V", "f", "d", JWKParameterNames.RSA_EXPONENT, "b", "a", "c", IntegerTokenConverter.CONVERTER_KEY, "h", "g", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends f1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f36323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f36324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GroupDTO f36325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f36326f;

    public interface c {
        void W3(GroupChallengeDTO groupChallengeDTO);

        void g2(com.garmin.android.apps.connectmobile.group.details.challenges.b bVar);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.group.details.challenges.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$d;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$a;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Lcom/garmin/android/apps/connectmobile/group/details/challenges/d;Landroidx/compose/ui/platform/ComposeView;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class C0641d extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f36330d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ComposeView f36331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jm0.b f36332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f36333c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0641d(d dVar, ComposeView composeView) {
            super(composeView, null);
            composeView.getClass();
            this.f36333c = dVar;
            this.f36331a = composeView;
            this.f36332b = (jm0.b) KoinJavaComponent.get$default(jm0.b.class, null, null, 6, null);
        }

        @Override // com.garmin.android.apps.connectmobile.group.details.challenges.d.a
        public final void d(com.garmin.android.apps.connectmobile.group.details.challenges.a aVar, GroupDTO groupDTO) {
            aVar.getClass();
            com.garmin.android.apps.connectmobile.group.details.challenges.a.b bVar = aVar instanceof com.garmin.android.apps.connectmobile.group.details.challenges.a.b ? (com.garmin.android.apps.connectmobile.group.details.challenges.a.b) aVar : null;
            GroupChallengeDTO groupChallengeDTO = bVar != null ? bVar.f36290a : null;
            if (groupChallengeDTO == null) {
                return;
            }
            this.f36331a.setContent(new z3.e(1425913555, true, new pm0.g(this.f36333c, groupChallengeDTO, aVar, this, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$e;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$a;", "Landroid/view/View;", "itemView", "<init>", "(Lcom/garmin/android/apps/connectmobile/group/details/challenges/d;Landroid/view/View;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class e extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f36334c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f36335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f36336b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar, View view2) {
            super(view2, null);
            view2.getClass();
            this.f36336b = dVar;
            this.f36335a = (TextView) view2.findViewById(R.id.title);
        }

        @Override // com.garmin.android.apps.connectmobile.group.details.challenges.d.a
        public final void d(com.garmin.android.apps.connectmobile.group.details.challenges.a aVar, GroupDTO groupDTO) {
            aVar.getClass();
            com.garmin.android.apps.connectmobile.group.details.challenges.a.d dVar = aVar instanceof com.garmin.android.apps.connectmobile.group.details.challenges.a.d ? (com.garmin.android.apps.connectmobile.group.details.challenges.a.d) aVar : null;
            com.garmin.android.apps.connectmobile.group.details.challenges.b bVar = dVar != null ? dVar.f36294a : null;
            if (bVar == null) {
                this.itemView.setOnClickListener(null);
                return;
            }
            Context context = this.itemView.getContext();
            context.getClass();
            this.f36335a.setText(bVar.a(context));
            this.itemView.setOnClickListener(new pm0.h(0, this.f36336b, bVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$f;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$a;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f36337a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view2) {
            super(view2, null);
            view2.getClass();
            this.f36337a = (TextView) view2.findViewById(R.id.title);
        }

        @Override // com.garmin.android.apps.connectmobile.group.details.challenges.d.a
        public final void d(com.garmin.android.apps.connectmobile.group.details.challenges.a aVar, GroupDTO groupDTO) {
            String strB;
            aVar.getClass();
            com.garmin.android.apps.connectmobile.group.details.challenges.a.c cVar = aVar instanceof com.garmin.android.apps.connectmobile.group.details.challenges.a.c ? (com.garmin.android.apps.connectmobile.group.details.challenges.a.c) aVar : null;
            com.garmin.android.apps.connectmobile.group.details.challenges.b bVar = cVar != null ? cVar.f36293a : null;
            View view2 = this.itemView;
            if (bVar != null) {
                Context context = view2.getContext();
                context.getClass();
                int i14 = com.garmin.android.apps.connectmobile.group.details.challenges.b.C0639b.f36300a[bVar.ordinal()];
                if (i14 == 1) {
                    strB = context.getString(R.string.lbl_personal_records_current_record);
                    strB.getClass();
                } else if (i14 != 2) {
                    u0.r();
                    return;
                } else {
                    strB = context.getString(R.string.concept_past);
                    strB.getClass();
                }
            } else {
                strB = z.b(R.string.concept_challenges, view2);
            }
            this.f36337a.setText(strB);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$h;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum h {
        NAVIGATE_TO_CREATE_CHALLENGE,
        NAVIGATE_TO_INVITE_MEMBERS
    }

    public interface i {
        void B2(h hVar);
    }

    static {
        new g(null);
    }

    public /* synthetic */ d(c cVar, i iVar, GroupDTO groupDTO, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : cVar, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? null : groupDTO);
    }

    @Override // com.garmin.android.apps.connectmobile.f1, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        com.garmin.android.apps.connectmobile.group.details.challenges.a aVar = (com.garmin.android.apps.connectmobile.group.details.challenges.a) this.f36326f.get(i14);
        if (aVar instanceof com.garmin.android.apps.connectmobile.group.details.challenges.a.c) {
            return 10;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.group.details.challenges.a.b) {
            return 11;
        }
        if (aVar instanceof com.garmin.android.apps.connectmobile.group.details.challenges.a.d) {
            return 13;
        }
        if (s.g(aVar, com.garmin.android.apps.connectmobile.group.details.challenges.a.C0637a.f36289a)) {
            return 14;
        }
        u0.r();
        return 0;
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f36326f.size();
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        a aVar = f0Var instanceof a ? (a) f0Var : null;
        if (aVar != null) {
            aVar.d((com.garmin.android.apps.connectmobile.group.details.challenges.a) this.f36326f.get(i14), this.f36325e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        switch (i14) {
            case 10:
                return new f(n23.j.b(viewGroup, R.layout.item_group_challenge_list_title, viewGroup, false));
            case 11:
                Context context = viewGroup.getContext();
                context.getClass();
                return new C0641d(this, new ComposeView(context, null, 0, 6, null));
            case 12:
            default:
                return new b(new View(viewGroup.getContext()), null, 2, 0 == true ? 1 : 0);
            case 13:
                return new e(this, n23.j.b(viewGroup, R.layout.item_group_challenge_list_view_all_btn, viewGroup, false));
            case 14:
                return new b(n23.j.b(viewGroup, R.layout.item_group_challenge_list_all_empty, viewGroup, false), this.f36324d);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$a;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$b;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$d;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$e;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$f;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a extends RecyclerView.f0 {
        public /* synthetic */ a(View view2, j jVar) {
            this(view2);
        }

        public abstract void d(com.garmin.android.apps.connectmobile.group.details.challenges.a aVar, GroupDTO groupDTO);

        private a(View view2) {
            super(view2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$g;", "", "<init>", "()V", "", "TITLE_ITEM", "I", "LIST_ITEM", "VIEW_ALL_BTN", "ALL_EMPTY", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class g {
        public /* synthetic */ g(j jVar) {
            this();
        }

        private g() {
        }
    }

    public d(c cVar, i iVar, GroupDTO groupDTO) {
        this.f36323c = cVar;
        this.f36324d = iVar;
        this.f36325e = groupDTO;
        this.f36326f = new ArrayList();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$b;", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$a;", "Landroid/view/View;", "itemView", "Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$i;", "groupChallengeEmptyStateClickListener", "<init>", "(Landroid/view/View;Lcom/garmin/android/apps/connectmobile/group/details/challenges/d$i;)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f36327c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f36328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ComposeView f36329b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view2, i iVar) {
            super(view2, null);
            view2.getClass();
            this.f36328a = iVar;
            View viewFindViewById = view2.findViewById(R.id.challenge_empty);
            viewFindViewById.getClass();
            this.f36329b = (ComposeView) viewFindViewById;
        }

        @Override // com.garmin.android.apps.connectmobile.group.details.challenges.d.a
        public final void d(com.garmin.android.apps.connectmobile.group.details.challenges.a aVar, GroupDTO groupDTO) {
            boolean zD;
            aVar.getClass();
            boolean z14 = false;
            if (groupDTO != null) {
                jm0.e eVar = jm0.e.f99565a;
                GroupDTO.c cVar = groupDTO.f31578w;
                eVar.getClass();
                zD = jm0.e.d(cVar);
            } else {
                zD = false;
            }
            boolean zF = groupDTO != null ? jm0.e.f(String.valueOf(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk()), groupDTO) : false;
            if (groupDTO != null && groupDTO.f31580y == 1) {
                z14 = true;
            }
            this.f36329b.setContent(new z3.e(-1129975040, true, new pm0.e(zD, zF, z14, this, 0)));
        }

        public /* synthetic */ b(View view2, i iVar, int i14, j jVar) {
            this(view2, (i14 & 2) != 0 ? null : iVar);
        }
    }

    public d() {
        this(null, null, null, 7, null);
    }
}

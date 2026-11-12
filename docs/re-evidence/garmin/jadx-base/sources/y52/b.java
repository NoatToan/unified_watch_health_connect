package y52;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import g22.n;
import h32.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001#B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Ly52/b;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Ly52/b$a;", "c", "Ly52/b$a;", "getTextChangedListener", "()Ly52/b$a;", "setTextChangedListener", "(Ly52/b$a;)V", "textChangedListener", "", "value", "d", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "", JWKParameterNames.RSA_EXPONENT, "Z", "getShouldEnforceCharacterLimit", "()Z", "setShouldEnforceCharacterLimit", "(Z)V", "shouldEnforceCharacterLimit", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends LinearLayoutCompat {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f194524f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StyledInlineTextFieldViewDark f194525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GCMComplexOneLineButton f194526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a textChangedListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String text;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean shouldEnforceCharacterLimit;

    public interface a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.shouldEnforceCharacterLimit = true;
        LayoutInflater.from(context).inflate(R.layout.workout_note_edit_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.text_view_note);
        viewFindViewById.getClass();
        this.f194525a = (StyledInlineTextFieldViewDark) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.button_add_notes);
        viewFindViewById2.getClass();
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) viewFindViewById2;
        this.f194526b = gCMComplexOneLineButton;
        gCMComplexOneLineButton.setOnClickListener(new xp0.d(this, 7));
    }

    public final void b() {
        boolean z14 = this.shouldEnforceCharacterLimit;
        String str = this.text;
        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = this.f194525a;
        if (z14) {
            String str2 = str == null ? "" : str;
            final int i14 = 0;
            final int i15 = 1;
            styledInlineTextFieldViewDark.i(new h.c(str2, null, 200, null, null, new l(this) { // from class: y52.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f194523b;

                {
                    this.f194523b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i14;
                    b bVar = this.f194523b;
                    String str3 = (String) obj;
                    switch (i16) {
                        case 0:
                            int i17 = b.f194524f;
                            str3.getClass();
                            bVar.setText(str3);
                            b.a aVar = bVar.textChangedListener;
                            if (aVar != null) {
                                ((p62.e) aVar).e(str3);
                            }
                            break;
                        case 1:
                            int i18 = b.f194524f;
                            str3.getClass();
                            b.a aVar2 = bVar.textChangedListener;
                            if (aVar2 != null) {
                                ((p62.e) aVar2).e(str3);
                            }
                            break;
                        case 2:
                            int i19 = b.f194524f;
                            str3.getClass();
                            bVar.setText(str3);
                            b.a aVar3 = bVar.textChangedListener;
                            if (aVar3 != null) {
                                ((p62.e) aVar3).e(str3);
                            }
                            break;
                        default:
                            int i24 = b.f194524f;
                            str3.getClass();
                            b.a aVar4 = bVar.textChangedListener;
                            if (aVar4 != null) {
                                ((p62.e) aVar4).e(str3);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, null, null, 0, true, null, new l(this) { // from class: y52.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b f194523b;

                {
                    this.f194523b = this;
                }

                @Override // e23.l
                public final Object invoke(Object obj) {
                    int i16 = i15;
                    b bVar = this.f194523b;
                    String str3 = (String) obj;
                    switch (i16) {
                        case 0:
                            int i17 = b.f194524f;
                            str3.getClass();
                            bVar.setText(str3);
                            b.a aVar = bVar.textChangedListener;
                            if (aVar != null) {
                                ((p62.e) aVar).e(str3);
                            }
                            break;
                        case 1:
                            int i18 = b.f194524f;
                            str3.getClass();
                            b.a aVar2 = bVar.textChangedListener;
                            if (aVar2 != null) {
                                ((p62.e) aVar2).e(str3);
                            }
                            break;
                        case 2:
                            int i19 = b.f194524f;
                            str3.getClass();
                            bVar.setText(str3);
                            b.a aVar3 = bVar.textChangedListener;
                            if (aVar3 != null) {
                                ((p62.e) aVar3).e(str3);
                            }
                            break;
                        default:
                            int i24 = b.f194524f;
                            str3.getClass();
                            b.a aVar4 = bVar.textChangedListener;
                            if (aVar4 != null) {
                                ((p62.e) aVar4).e(str3);
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, 1498, null));
            return;
        }
        String str3 = str == null ? "" : str;
        final int i16 = 2;
        final int i17 = 3;
        styledInlineTextFieldViewDark.i(new h.c(str3, null, null, null, null, new l(this) { // from class: y52.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f194523b;

            {
                this.f194523b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i16;
                b bVar = this.f194523b;
                String str4 = (String) obj;
                switch (i18) {
                    case 0:
                        int i19 = b.f194524f;
                        str4.getClass();
                        bVar.setText(str4);
                        b.a aVar = bVar.textChangedListener;
                        if (aVar != null) {
                            ((p62.e) aVar).e(str4);
                        }
                        break;
                    case 1:
                        int i110 = b.f194524f;
                        str4.getClass();
                        b.a aVar2 = bVar.textChangedListener;
                        if (aVar2 != null) {
                            ((p62.e) aVar2).e(str4);
                        }
                        break;
                    case 2:
                        int i111 = b.f194524f;
                        str4.getClass();
                        bVar.setText(str4);
                        b.a aVar3 = bVar.textChangedListener;
                        if (aVar3 != null) {
                            ((p62.e) aVar3).e(str4);
                        }
                        break;
                    default:
                        int i24 = b.f194524f;
                        str4.getClass();
                        b.a aVar4 = bVar.textChangedListener;
                        if (aVar4 != null) {
                            ((p62.e) aVar4).e(str4);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, null, null, 0, true, null, new l(this) { // from class: y52.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f194523b;

            {
                this.f194523b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                b bVar = this.f194523b;
                String str4 = (String) obj;
                switch (i18) {
                    case 0:
                        int i19 = b.f194524f;
                        str4.getClass();
                        bVar.setText(str4);
                        b.a aVar = bVar.textChangedListener;
                        if (aVar != null) {
                            ((p62.e) aVar).e(str4);
                        }
                        break;
                    case 1:
                        int i110 = b.f194524f;
                        str4.getClass();
                        b.a aVar2 = bVar.textChangedListener;
                        if (aVar2 != null) {
                            ((p62.e) aVar2).e(str4);
                        }
                        break;
                    case 2:
                        int i111 = b.f194524f;
                        str4.getClass();
                        bVar.setText(str4);
                        b.a aVar3 = bVar.textChangedListener;
                        if (aVar3 != null) {
                            ((p62.e) aVar3).e(str4);
                        }
                        break;
                    default:
                        int i24 = b.f194524f;
                        str4.getClass();
                        b.a aVar4 = bVar.textChangedListener;
                        if (aVar4 != null) {
                            ((p62.e) aVar4).e(str4);
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        }, 1502, null));
    }

    public final boolean getShouldEnforceCharacterLimit() {
        return this.shouldEnforceCharacterLimit;
    }

    public final String getText() {
        return this.text;
    }

    public final a getTextChangedListener() {
        return this.textChangedListener;
    }

    public final void setShouldEnforceCharacterLimit(boolean z14) {
        this.shouldEnforceCharacterLimit = z14;
    }

    public final void setText(String str) {
        this.text = str;
        v22.e.v(this.f194526b, str == null || str.length() == 0);
        v22.e.v(this.f194525a, n.d(str));
        b();
    }

    public final void setTextChangedListener(a aVar) {
        this.textChangedListener = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}

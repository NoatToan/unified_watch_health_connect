package com.garmin.android.apps.connectmobile.tag;

import a73.n;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ArrowKeyMovementMethod;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatEditText;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import cs1.e;
import cs1.f;
import cs1.g;
import d53.w;
import j23.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.u;
import p13.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0003\u000b\u001a\u001bB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/TaggableEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcs1/f;", "c", "Lcs1/f;", "getSuggestionListener", "()Lcs1/f;", "setSuggestionListener", "(Lcs1/f;)V", "suggestionListener", "", "d", "Z", "getParseTokenEnabled", "()Z", "setParseTokenEnabled", "(Z)V", "parseTokenEnabled", "b", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TaggableEditText extends AppCompatEditText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f45043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f45044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public f suggestionListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean parseTokenEnabled;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/TaggableEditText$c;", "Landroid/text/TextWatcher;", "<init>", "(Lcom/garmin/android/apps/connectmobile/tag/TaggableEditText;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f45052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f45053b = new ArrayList();

        public c() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (this.f45052a) {
                return;
            }
            this.f45052a = true;
            ArrayList arrayList = this.f45053b;
            arrayList.getClass();
            Iterator it = new x0(arrayList).iterator();
            while (true) {
                ListIterator<T> listIterator = ((x0.a) it).f134964a;
                if (!listIterator.hasPrevious()) {
                    arrayList.clear();
                    this.f45052a = false;
                    return;
                }
                b bVar = (b) listIterator.previous();
                boolean z14 = bVar.f45051e;
                int i14 = bVar.f45049c;
                int i15 = bVar.f45048b;
                TaggableEditText taggableEditText = TaggableEditText.this;
                if (z14) {
                    Editable text = taggableEditText.getText();
                    if (text != null) {
                        text.replace(i15, i14, "");
                    }
                } else {
                    Editable text2 = taggableEditText.getText();
                    if (text2 != null) {
                        text2.setSpan(bVar.f45047a, i15, i14, 34);
                    }
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[SYNTHETIC] */
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            Editable text;
            b bVar;
            b bVar2;
            if (this.f45052a || (text = TaggableEditText.this.getText()) == null) {
                return;
            }
            int i17 = i14 + i15;
            int i18 = i14 + i16;
            CharSequence charSequenceSubSequence = text.subSequence(0, i17);
            int i19 = -1;
            int length = charSequenceSubSequence.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i24 = length - 1;
                    if (d53.a.b(charSequenceSubSequence.charAt(length))) {
                        i19 = length;
                        break;
                    } else if (i24 < 0) {
                        break;
                    } else {
                        length = i24;
                    }
                }
            }
            ArrayList arrayList = this.f45053b;
            arrayList.clear();
            for (Object obj : text.getSpans(i19 + 1, i17, cs1.a.class)) {
                cs1.a aVar = (cs1.a) obj;
                int spanStart = text.getSpanStart(aVar);
                int spanEnd = text.getSpanEnd(aVar);
                text.removeSpan(aVar);
                if (spanEnd <= i14) {
                    bVar = new b(aVar, spanStart, spanEnd, false, false, 24, null);
                } else if (spanEnd <= i18) {
                    bVar = new b(aVar, spanStart, spanEnd, true, false, 16, null);
                } else {
                    bVar = null;
                    if (i18 + 1 <= spanEnd && spanEnd <= i17) {
                        if (spanStart < i18) {
                            bVar2 = new b(aVar, spanStart, i18, false, true, 8, null);
                        }
                        if (bVar2 != null) {
                            arrayList.add(bVar2);
                        }
                    } else if (spanStart >= i17) {
                        int i25 = i16 - i15;
                        bVar = new b(aVar, spanStart + i25, spanEnd + i25, false, false, 24, null);
                    }
                }
                bVar2 = bVar;
                if (bVar2 != null) {
                    arrayList.add(bVar2);
                }
            }
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i14, int i15, int i16) {
            if (this.f45052a) {
                return;
            }
            if (charSequence == null) {
                charSequence = "";
            }
            this.f45053b.removeIf(new n(new cs1.b(charSequence, 0), 6));
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaggableEditText(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        c cVar = new c();
        this.f45043a = new g();
        this.f45044b = attributeSet != null ? attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLength", 255) : 255;
        this.parseTokenEnabled = true;
        setMovementMethod(ArrowKeyMovementMethod.getInstance());
        setEditableFactory(e.f55465a);
        addTextChangedListener(cVar);
    }

    public final void a(ds1.a aVar) {
        aVar.getClass();
        int iMax = Math.max(getSelectionStart(), 0);
        Editable editableText = getEditableText();
        editableText.getClass();
        this.f45043a.getClass();
        int iA = g.a(editableText, iMax);
        int length = aVar.b().length() + iA;
        int length2 = getEditableText().length();
        int i14 = iMax - iA;
        int length3 = (length2 - i14) + aVar.b().length();
        clearComposingText();
        int i15 = this.f45044b;
        if (length3 <= i15) {
            getEditableText().replace(iA, iMax, aVar.b());
            Editable editableText2 = getEditableText();
            Context context = getContext();
            context.getClass();
            editableText2.setSpan(new cs1.a(context, aVar), iA, length, 33);
        } else {
            getEditableText().replace(iA, iMax, "@".concat(w.b0(aVar.b(), t.o(0, ((i15 - length2) + i14) - 1))));
        }
        f fVar = this.suggestionListener;
        if (fVar != null) {
            fVar.v3(com.garmin.android.apps.connectmobile.tag.a.e.f45057a);
        }
    }

    public final Integer b(int i14) {
        cs1.a aVar;
        Editable text = getText();
        if (text != null && (aVar = (cs1.a) u.H(text.getSpans(i14, i14, cs1.a.class))) != null) {
            int spanStart = text.getSpanStart(aVar);
            int spanEnd = text.getSpanEnd(aVar);
            if (spanStart + 1 <= i14 && i14 < spanEnd) {
                return i14 - spanStart > spanEnd - i14 ? Integer.valueOf(spanEnd) : Integer.valueOf(spanStart);
            }
        }
        return null;
    }

    public final boolean getParseTokenEnabled() {
        return this.parseTokenEnabled;
    }

    public final f getSuggestionListener() {
        return this.suggestionListener;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    @Override // android.widget.TextView
    public final void onSelectionChanged(int i14, int i15) {
        Editable text;
        f fVar;
        char cCharAt;
        if (i14 != i15) {
            f fVar2 = this.suggestionListener;
            if (fVar2 != null) {
                fVar2.v3(com.garmin.android.apps.connectmobile.tag.a.e.f45057a);
            }
            Integer numB = b(i14);
            Integer numB2 = b(i15);
            if (numB == null && numB2 == null) {
                super.onSelectionChanged(i14, i15);
                return;
            }
            if (numB != null) {
                i14 = numB.intValue();
            }
            if (numB2 != null) {
                i15 = numB2.intValue();
            }
            setSelection(i14, i15);
            return;
        }
        if (this.parseTokenEnabled && (text = getText()) != null && (fVar = this.suggestionListener) != null) {
            int iMax = Math.max(getSelectionStart(), 0);
            this.f45043a.getClass();
            int iA = g.a(text, iMax);
            if (iA < 0 || iA >= text.length() || iMax > text.length() || iA >= iMax || !((cCharAt = text.charAt(iA)) == '@' || cCharAt == 65312)) {
                fVar.v3(com.garmin.android.apps.connectmobile.tag.a.e.f45057a);
            } else {
                int i16 = iA + 1;
                if (d53.u.y(text.subSequence(i16, iMax).toString(), StringUtils.SPACE, false)) {
                    fVar.v3(com.garmin.android.apps.connectmobile.tag.a.e.f45057a);
                } else {
                    fVar.w3(text.subSequence(i16, iMax).toString());
                }
            }
        }
        Integer numB3 = b(i14);
        if (numB3 != null) {
            setSelection(numB3.intValue(), numB3.intValue());
        } else {
            super.onSelectionChanged(i14, i15);
        }
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setParseTokenEnabled(boolean z14) {
        this.parseTokenEnabled = z14;
    }

    public final void setSuggestionListener(f fVar) {
        this.suggestionListener = fVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/TaggableEditText$a;", "", "<init>", "()V", "", "PATTERN_PLAIN_TEXT", "Ljava/lang/String;", "XML_NAMESPACE_ANDROID", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/tag/TaggableEditText$b;", "", "Lcs1/a;", "tagSpan", "", TtmlNode.START, TtmlNode.END, "", "shouldValidate", "shouldDelete", "<init>", "(Lcs1/a;IIZZ)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final cs1.a f45047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f45048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f45049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f45050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f45051e;

        public /* synthetic */ b(cs1.a aVar, int i14, int i15, boolean z14, boolean z15, int i16, j jVar) {
            this(aVar, i14, i15, (i16 & 8) != 0 ? false : z14, (i16 & 16) != 0 ? false : z15);
        }

        public b(cs1.a aVar, int i14, int i15, boolean z14, boolean z15) {
            aVar.getClass();
            this.f45047a = aVar;
            this.f45048b = i14;
            this.f45049c = i15;
            this.f45050d = z14;
            this.f45051e = z15;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaggableEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaggableEditText(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ TaggableEditText(Context context, AttributeSet attributeSet, int i14, int i15, j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? R.attr.editTextStyle : i14);
    }
}

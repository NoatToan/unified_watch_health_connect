package k5;

import android.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk5/b;", "", "", TtmlNode.ATTR_ID, "order", "<init>", "(Ljava/lang/String;III)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum b {
    Copy(R.id.copy, 0),
    Paste(R.id.paste, 1),
    Cut(R.id.cut, 2),
    SelectAll(R.id.selectAll, 3),
    Autofill(R.id.autofill, 4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f102906b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102907a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Copy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Paste.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Cut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SelectAll.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.Autofill.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f102907a = iArr;
        }
    }

    b(int i14, int i15) {
        this.f102905a = i14;
        this.f102906b = i15;
    }
}

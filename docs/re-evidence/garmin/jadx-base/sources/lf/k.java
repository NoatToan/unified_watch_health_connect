package lf;

import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k implements l {
    @Override // lf.l
    public final boolean a(String str) {
        if (str != null) {
            return str.equals(MimeTypes.IMAGE_JPEG) || str.equals("image/webp") || str.equals("image/heic") || str.equals("image/heif");
        }
        return false;
    }
}

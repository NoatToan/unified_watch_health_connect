package bq0;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p13.x;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lbq0/l;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f19513b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t13.g f19514a;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19515a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19515a = iArr;
        }
    }

    static {
        new a(null);
        f19513b = x.k("jpg", "jpeg", "png", "gif");
    }

    public l() {
        t13.g gVar = v1.a(this).f183565a;
        x53.c cVar = s0.f129406a;
        this.f19514a = gVar.plus(x53.b.f189152a);
    }

    public static androidx.lifecycle.j x4(l lVar, ContentResolver contentResolver) {
        List<String> list = f19513b;
        list.getClass();
        return androidx.lifecycle.m.a(lVar.f19514a, new o(contentResolver, "date_added DESC", list, null), 2);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lbq0/l$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ORDER_BY_DATE_DESC", "", "SHARE_IMAGE_QUALITY_JPEG", "I", "SHARE_IMAGE_QUALITY_PNG", "MIME_TYPE_JPEG", "MIME_TYPE_PNG", "MIME_TYPE_WEBP", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}

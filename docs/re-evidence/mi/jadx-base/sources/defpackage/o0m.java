package defpackage;

import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;

/* JADX INFO: loaded from: classes4.dex */
public class o0m extends da2 {
    public o0m(ImageRequest imageRequest, ebi ebiVar) {
        this(imageRequest, ebiVar.getId(), ebiVar.f(), ebiVar.a(), ebiVar.g(), ebiVar.e(), ebiVar.d(), ebiVar.getPriority());
    }

    public o0m(ImageRequest imageRequest, String str, hbi hbiVar, Object obj, ImageRequest.RequestLevel requestLevel, boolean z, boolean z2, Priority priority) {
        super(imageRequest, str, hbiVar, obj, requestLevel, z, z2, priority);
    }
}

package ne2;

import com.mapbox.maps.plugin.annotation.Annotation;
import com.mapbox.maps.plugin.annotation.generated.OnPointAnnotationDragListener;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne2/f;", "Lcom/mapbox/maps/plugin/annotation/generated/OnPointAnnotationDragListener;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements OnPointAnnotationDragListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f125590a;

    public f(s sVar) {
        this.f125590a = sVar;
    }

    @Override // com.mapbox.maps.plugin.annotation.OnAnnotationDragListener
    public final void onAnnotationDrag(Annotation<?> annotation) {
        annotation.getClass();
        s sVar = this.f125590a;
        ie2.j jVarC = p.c(sVar.D, annotation);
        if (jVarC != null) {
            s sVar2 = s.this;
            int i14 = s.M0;
            j40.c cVar = sVar2.f50249j;
            if (cVar != null) {
                cVar.q7(jVarC);
            }
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.OnAnnotationDragListener
    public final void onAnnotationDragFinished(Annotation<?> annotation) {
        annotation.getClass();
        s sVar = this.f125590a;
        ie2.j jVarC = p.c(sVar.D, annotation);
        if (jVarC != null) {
            s sVar2 = s.this;
            int i14 = s.M0;
            j40.c cVar = sVar2.f50249j;
            if (cVar != null) {
                cVar.r7(jVarC);
            }
        }
    }

    @Override // com.mapbox.maps.plugin.annotation.OnAnnotationDragListener
    public final void onAnnotationDragStarted(Annotation<?> annotation) {
        annotation.getClass();
        s sVar = this.f125590a;
        ie2.j jVarC = p.c(sVar.D, annotation);
        if (jVarC != null) {
            s sVar2 = s.this;
            int i14 = s.M0;
            j40.c cVar = sVar2.f50249j;
            if (cVar != null) {
                cVar.u7(jVarC);
            }
        }
    }
}

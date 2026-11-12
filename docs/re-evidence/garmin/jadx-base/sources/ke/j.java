package ke;

import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: loaded from: classes7.dex */
public class j implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebViewProviderFactoryBoundaryInterface f104537a;

    public j(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f104537a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // ke.i
    public final String[] a() {
        return this.f104537a.getSupportedFeatures();
    }

    @Override // ke.i
    public final StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) d73.a.a(StaticsBoundaryInterface.class, this.f104537a.getStatics());
    }

    @Override // ke.i
    public final WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) d73.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f104537a.getWebkitToCompatConverter());
    }
}

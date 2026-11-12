package com.google.maps.android.kml;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes3.dex */
public class KmlLayer {
    private final d a;

    public KmlLayer(GoogleMap googleMap, int i, Context context) throws XmlPullParserException, IOException {
        this(googleMap, context.getResources().openRawResource(i), context);
    }

    private static XmlPullParser a(InputStream inputStream) throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
        xmlPullParserNewPullParser.setInput(inputStream, null);
        return xmlPullParserNewPullParser;
    }

    public void addLayerToMap() throws XmlPullParserException, IOException {
        this.a.s();
    }

    public Iterable<KmlContainer> getContainers() {
        return this.a.J();
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return this.a.G();
    }

    public GoogleMap getMap() {
        return this.a.I();
    }

    public Iterable<KmlPlacemark> getPlacemarks() {
        return this.a.H();
    }

    public boolean hasContainers() {
        return this.a.N();
    }

    public boolean hasPlacemarks() {
        return this.a.M();
    }

    public void removeLayerFromMap() {
        this.a.Q();
    }

    public void setMap(GoogleMap googleMap) {
        this.a.X(googleMap);
    }

    public KmlLayer(GoogleMap googleMap, InputStream inputStream, Context context) throws XmlPullParserException, IOException {
        if (inputStream == null) {
            throw new IllegalArgumentException("KML InputStream cannot be null");
        }
        d dVar = new d(googleMap, context);
        this.a = dVar;
        c cVar = new c(a(inputStream));
        cVar.f();
        inputStream.close();
        dVar.Z(cVar.e(), cVar.d(), cVar.c(), cVar.a(), cVar.b());
    }
}

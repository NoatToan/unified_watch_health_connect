package com.nimbusds.jose;

import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.gson.internal.a;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import java.text.ParseException;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class PlainObject extends JOSEObject {
    private static final long serialVersionUID = 1;
    private final PlainHeader header;

    public PlainObject(Base64URL base64URL, Base64URL base64URL2) throws ParseException {
        try {
            Objects.requireNonNull(base64URL);
            this.header = PlainHeader.parse(base64URL);
            Objects.requireNonNull(base64URL2);
            setPayload(new Payload(base64URL2));
            setParsedParts(base64URL, base64URL2, null);
        } catch (ParseException e4) {
            a.A(e4.getMessage(), "Invalid unsecured header: ");
            throw null;
        }
    }

    public static PlainObject parse(String str) throws ParseException {
        Base64URL[] base64URLArrSplit = JOSEObject.split(str);
        if (base64URLArrSplit[2].toString().isEmpty()) {
            return new PlainObject(base64URLArrSplit[0], base64URLArrSplit[1]);
        }
        p.i(0, "Unexpected third Base64URL part");
        return null;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public String serialize() {
        return this.header.toBase64URL().toString() + '.' + getPayload().toBase64URL().toString() + '.';
    }

    @Override // com.nimbusds.jose.JOSEObject
    public PlainHeader getHeader() {
        return this.header;
    }

    public PlainObject(PlainHeader plainHeader, Payload payload) {
        Objects.requireNonNull(plainHeader);
        this.header = plainHeader;
        Objects.requireNonNull(payload);
        setPayload(payload);
    }

    public PlainObject(Payload payload) {
        Objects.requireNonNull(payload);
        setPayload(payload);
        this.header = new PlainHeader();
    }
}

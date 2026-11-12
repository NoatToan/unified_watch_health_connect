package com.nimbusds.jose;

import com.mapbox.maps.p;
import com.nimbusds.jose.shaded.jcip.Immutable;
import com.nimbusds.jose.shaded.jcip.ThreadSafe;
import com.nimbusds.jose.util.Base64URL;
import com.nimbusds.jose.util.JSONArrayUtils;
import com.nimbusds.jose.util.JSONObjectUtils;
import j20.x;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public class JWSObjectJSON extends JOSEObjectJSON {
    private static final long serialVersionUID = 1;
    private final List<Signature> signatures;

    @Immutable
    public static final class Signature {
        private final JWSHeader header;
        private final Payload payload;
        private final Base64URL signature;
        private final UnprotectedHeader unprotectedHeader;
        private final AtomicBoolean verified;

        private Signature(Payload payload, JWSHeader jWSHeader, UnprotectedHeader unprotectedHeader, Base64URL base64URL) {
            this.verified = new AtomicBoolean(false);
            Objects.requireNonNull(payload);
            this.payload = payload;
            this.header = jWSHeader;
            this.unprotectedHeader = unprotectedHeader;
            Objects.requireNonNull(base64URL);
            this.signature = base64URL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<String, Object> toJSONObject() {
            Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
            JWSHeader jWSHeader = this.header;
            if (jWSHeader != null) {
                mapNewJSONObject.put("protected", jWSHeader.toBase64URL().toString());
            }
            UnprotectedHeader unprotectedHeader = this.unprotectedHeader;
            if (unprotectedHeader != null && !unprotectedHeader.getIncludedParams().isEmpty()) {
                mapNewJSONObject.put("header", this.unprotectedHeader.toJSONObject());
            }
            mapNewJSONObject.put("signature", this.signature.toString());
            return mapNewJSONObject;
        }

        public JWSHeader getHeader() {
            return this.header;
        }

        public Base64URL getSignature() {
            return this.signature;
        }

        public UnprotectedHeader getUnprotectedHeader() {
            return this.unprotectedHeader;
        }

        public boolean isVerified() {
            return this.verified.get();
        }

        public JWSObject toJWSObject() {
            try {
                return new JWSObject(this.header.toBase64URL(), this.payload.toBase64URL(), this.signature);
            } catch (ParseException unused) {
                x.h();
                return null;
            }
        }

        public synchronized boolean verify(JWSVerifier jWSVerifier) {
            try {
                try {
                    this.verified.set(toJWSObject().verify(jWSVerifier));
                } catch (Exception e4) {
                    throw new JOSEException(e4.getMessage(), e4);
                }
            } catch (JOSEException e14) {
                throw e14;
            }
            return this.verified.get();
        }
    }

    public enum State {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private JWSObjectJSON(Payload payload, List<Signature> list) {
        super(payload);
        Objects.requireNonNull(payload, "The payload must not be null");
        LinkedList linkedList = new LinkedList();
        this.signatures = linkedList;
        if (list.isEmpty()) {
            h.s("At least one signature required");
            throw null;
        }
        linkedList.addAll(list);
    }

    public static JWSObjectJSON parse(Map<String, Object> map) throws ParseException {
        Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "payload");
        if (base64URL == null) {
            p.i(0, "Missing payload");
            return null;
        }
        Payload payload = new Payload(base64URL);
        Base64URL base64URL2 = JSONObjectUtils.getBase64URL(map, "signature");
        boolean z14 = base64URL2 != null;
        LinkedList linkedList = new LinkedList();
        if (z14) {
            JWSHeader jWSHeader = parseJWSHeader(map);
            UnprotectedHeader unprotectedHeader = UnprotectedHeader.parse(JSONObjectUtils.getJSONObject(map, "header"));
            if (map.get("signatures") != null) {
                p.i(0, "The \"signatures\" member must not be present in flattened JWS JSON serialization");
                return null;
            }
            try {
                HeaderValidation.ensureDisjoint(jWSHeader, unprotectedHeader);
                linkedList.add(new Signature(payload, jWSHeader, unprotectedHeader, base64URL2));
            } catch (IllegalHeaderException e4) {
                p.i(0, e4.getMessage());
                return null;
            }
        } else {
            Map<String, Object>[] jSONObjectArray = JSONObjectUtils.getJSONObjectArray(map, "signatures");
            if (jSONObjectArray == null || jSONObjectArray.length == 0) {
                p.i(0, "The \"signatures\" member must be present in general JSON Serialization");
                return null;
            }
            for (Map<String, Object> map2 : jSONObjectArray) {
                JWSHeader jWSHeader2 = parseJWSHeader(map2);
                UnprotectedHeader unprotectedHeader2 = UnprotectedHeader.parse(JSONObjectUtils.getJSONObject(map2, "header"));
                try {
                    HeaderValidation.ensureDisjoint(jWSHeader2, unprotectedHeader2);
                    Base64URL base64URL3 = JSONObjectUtils.getBase64URL(map2, "signature");
                    if (base64URL3 == null) {
                        p.i(0, "Missing \"signature\" member");
                        return null;
                    }
                    linkedList.add(new Signature(payload, jWSHeader2, unprotectedHeader2, base64URL3));
                } catch (IllegalHeaderException e14) {
                    p.i(0, e14.getMessage());
                    return null;
                }
            }
        }
        return new JWSObjectJSON(payload, linkedList);
    }

    private static JWSHeader parseJWSHeader(Map<String, Object> map) throws ParseException {
        Base64URL base64URL = JSONObjectUtils.getBase64URL(map, "protected");
        if (base64URL == null) {
            p.i(0, "Missing protected header (required by this library)");
            return null;
        }
        try {
            return JWSHeader.parse(base64URL);
        } catch (ParseException e4) {
            if (!"Not a JWS header".equals(e4.getMessage())) {
                throw e4;
            }
            p.i(0, "Missing JWS \"alg\" parameter in protected header (required by this library)");
            return null;
        }
    }

    public List<Signature> getSignatures() {
        return Collections.unmodifiableList(this.signatures);
    }

    public State getState() {
        if (getSignatures().isEmpty()) {
            return State.UNSIGNED;
        }
        Iterator<Signature> it = getSignatures().iterator();
        while (it.hasNext()) {
            if (!it.next().isVerified()) {
                return State.SIGNED;
            }
        }
        return State.VERIFIED;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public String serializeFlattened() {
        return JSONObjectUtils.toJSONString(toFlattenedJSONObject());
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public String serializeGeneral() {
        return JSONObjectUtils.toJSONString(toGeneralJSONObject());
    }

    public synchronized void sign(JWSHeader jWSHeader, UnprotectedHeader unprotectedHeader, JWSSigner jWSSigner) {
        try {
            HeaderValidation.ensureDisjoint(jWSHeader, unprotectedHeader);
            JWSObject jWSObject = new JWSObject(jWSHeader, getPayload());
            jWSObject.sign(jWSSigner);
            this.signatures.add(new Signature(getPayload(), jWSHeader, unprotectedHeader, jWSObject.getSignature()));
        } catch (IllegalHeaderException e4) {
            throw new IllegalArgumentException(e4.getMessage(), e4);
        }
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public Map<String, Object> toFlattenedJSONObject() {
        if (this.signatures.size() != 1) {
            h.z("The flattened JWS JSON serialization requires exactly one signature");
            return null;
        }
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        mapNewJSONObject.put("payload", getPayload().toBase64URL().toString());
        mapNewJSONObject.putAll(getSignatures().get(0).toJSONObject());
        return mapNewJSONObject;
    }

    @Override // com.nimbusds.jose.JOSEObjectJSON
    public Map<String, Object> toGeneralJSONObject() {
        if (this.signatures.size() < 1) {
            h.z("The general JWS JSON serialization requires at least one signature");
            return null;
        }
        Map<String, Object> mapNewJSONObject = JSONObjectUtils.newJSONObject();
        mapNewJSONObject.put("payload", getPayload().toBase64URL().toString());
        List<Object> listNewJSONArray = JSONArrayUtils.newJSONArray();
        Iterator<Signature> it = getSignatures().iterator();
        while (it.hasNext()) {
            listNewJSONArray.add(it.next().toJSONObject());
        }
        mapNewJSONObject.put("signatures", listNewJSONArray);
        return mapNewJSONObject;
    }

    public JWSObjectJSON(Payload payload) {
        super(payload);
        this.signatures = new LinkedList();
        Objects.requireNonNull(payload, "The payload must not be null");
    }

    public synchronized void sign(JWSHeader jWSHeader, JWSSigner jWSSigner) {
        sign(jWSHeader, null, jWSSigner);
    }

    public static JWSObjectJSON parse(String str) {
        return parse(JSONObjectUtils.parse(str));
    }
}

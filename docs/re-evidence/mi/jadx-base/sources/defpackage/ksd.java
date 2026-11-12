package defpackage;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

/* JADX INFO: loaded from: classes4.dex */
public interface ksd extends jsd {

    public static class a implements ksd {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public wwl f24259a;

        public a(wwl wwlVar) {
            this.f24259a = wwlVar;
        }

        @Override // defpackage.jsd
        public wwl a() {
            return this.f24259a;
        }

        @Override // defpackage.ksd
        public tsd b(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.ksd
        public wsd e(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.ksd
        public hud f(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.ksd
        public btd h(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.jsd
        public void j(wwl wwlVar) {
            this.f24259a = wwlVar;
        }

        @Override // defpackage.ksd
        public urd k(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.ksd
        public ctd l(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.ksd
        public yrd m(JavaType javaType) throws JsonMappingException {
            return null;
        }

        @Override // defpackage.ksd
        public asd n(JavaType javaType) throws JsonMappingException {
            return null;
        }
    }

    tsd b(JavaType javaType) throws JsonMappingException;

    itd d(JavaType javaType) throws JsonMappingException;

    wsd e(JavaType javaType) throws JsonMappingException;

    hud f(JavaType javaType) throws JsonMappingException;

    btd h(JavaType javaType) throws JsonMappingException;

    urd k(JavaType javaType) throws JsonMappingException;

    ctd l(JavaType javaType) throws JsonMappingException;

    yrd m(JavaType javaType) throws JsonMappingException;

    asd n(JavaType javaType) throws JsonMappingException;
}

package com.nimbusds.jose;

import defpackage.r51;
import defpackage.tj1;
import java.util.Collection;
import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes6.dex */
@Immutable
public final class JWEAlgorithm extends Algorithm {
    public static final JWEAlgorithm A128GCMKW;
    public static final JWEAlgorithm A128KW;
    public static final JWEAlgorithm A192GCMKW;
    public static final JWEAlgorithm A192KW;
    public static final JWEAlgorithm A256GCMKW;
    public static final JWEAlgorithm A256KW;
    public static final JWEAlgorithm DIR;
    public static final JWEAlgorithm ECDH_ES;
    public static final JWEAlgorithm ECDH_ES_A128KW;
    public static final JWEAlgorithm ECDH_ES_A192KW;
    public static final JWEAlgorithm ECDH_ES_A256KW;
    public static final JWEAlgorithm PBES2_HS256_A128KW;
    public static final JWEAlgorithm PBES2_HS384_A192KW;
    public static final JWEAlgorithm PBES2_HS512_A256KW;

    @Deprecated
    public static final JWEAlgorithm RSA1_5 = new JWEAlgorithm("RSA1_5", Requirement.REQUIRED);

    @Deprecated
    public static final JWEAlgorithm RSA_OAEP;
    public static final JWEAlgorithm RSA_OAEP_256;
    private static final long serialVersionUID = 1;

    public static final class Family extends r51<JWEAlgorithm> {
        public static final Family AES_GCM_KW;
        public static final Family AES_KW;
        public static final Family ASYMMETRIC;
        public static final Family ECDH_ES;
        public static final Family PBES2;
        public static final Family RSA;
        public static final Family SYMMETRIC;
        private static final long serialVersionUID = 1;

        static {
            Family family = new Family(JWEAlgorithm.RSA1_5, JWEAlgorithm.RSA_OAEP, JWEAlgorithm.RSA_OAEP_256);
            RSA = family;
            Family family2 = new Family(JWEAlgorithm.A128KW, JWEAlgorithm.A192KW, JWEAlgorithm.A256KW);
            AES_KW = family2;
            Family family3 = new Family(JWEAlgorithm.ECDH_ES, JWEAlgorithm.ECDH_ES_A128KW, JWEAlgorithm.ECDH_ES_A192KW, JWEAlgorithm.ECDH_ES_A256KW);
            ECDH_ES = family3;
            Family family4 = new Family(JWEAlgorithm.A128GCMKW, JWEAlgorithm.A192GCMKW, JWEAlgorithm.A256GCMKW);
            AES_GCM_KW = family4;
            PBES2 = new Family(JWEAlgorithm.PBES2_HS256_A128KW, JWEAlgorithm.PBES2_HS384_A192KW, JWEAlgorithm.PBES2_HS512_A256KW);
            ASYMMETRIC = new Family((JWEAlgorithm[]) tj1.a(family.toArray(new JWEAlgorithm[0]), (JWEAlgorithm[]) family3.toArray(new JWEAlgorithm[0])));
            SYMMETRIC = new Family((JWEAlgorithm[]) tj1.a(family2.toArray(new JWEAlgorithm[0]), (JWEAlgorithm[]) family4.toArray(new JWEAlgorithm[0]), new JWEAlgorithm[]{JWEAlgorithm.DIR}));
        }

        public Family(JWEAlgorithm... jWEAlgorithmArr) {
            super(jWEAlgorithmArr);
        }

        @Override // defpackage.r51, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
            return super.addAll(collection);
        }

        @Override // defpackage.r51, java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean remove(Object obj) {
            return super.remove(obj);
        }

        @Override // defpackage.r51, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
            return super.removeAll(collection);
        }

        @Override // defpackage.r51, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
            return super.retainAll(collection);
        }
    }

    static {
        Requirement requirement = Requirement.OPTIONAL;
        RSA_OAEP = new JWEAlgorithm("RSA-OAEP", requirement);
        RSA_OAEP_256 = new JWEAlgorithm("RSA-OAEP-256", requirement);
        Requirement requirement2 = Requirement.RECOMMENDED;
        A128KW = new JWEAlgorithm("A128KW", requirement2);
        A192KW = new JWEAlgorithm("A192KW", requirement);
        A256KW = new JWEAlgorithm("A256KW", requirement2);
        DIR = new JWEAlgorithm("dir", requirement2);
        ECDH_ES = new JWEAlgorithm("ECDH-ES", requirement2);
        ECDH_ES_A128KW = new JWEAlgorithm("ECDH-ES+A128KW", requirement2);
        ECDH_ES_A192KW = new JWEAlgorithm("ECDH-ES+A192KW", requirement);
        ECDH_ES_A256KW = new JWEAlgorithm("ECDH-ES+A256KW", requirement2);
        A128GCMKW = new JWEAlgorithm("A128GCMKW", requirement);
        A192GCMKW = new JWEAlgorithm("A192GCMKW", requirement);
        A256GCMKW = new JWEAlgorithm("A256GCMKW", requirement);
        PBES2_HS256_A128KW = new JWEAlgorithm("PBES2-HS256+A128KW", requirement);
        PBES2_HS384_A192KW = new JWEAlgorithm("PBES2-HS384+A192KW", requirement);
        PBES2_HS512_A256KW = new JWEAlgorithm("PBES2-HS512+A256KW", requirement);
    }

    public JWEAlgorithm(String str, Requirement requirement) {
        super(str, requirement);
    }

    public static JWEAlgorithm parse(String str) {
        JWEAlgorithm jWEAlgorithm = RSA1_5;
        if (str.equals(jWEAlgorithm.getName())) {
            return jWEAlgorithm;
        }
        JWEAlgorithm jWEAlgorithm2 = RSA_OAEP;
        if (str.equals(jWEAlgorithm2.getName())) {
            return jWEAlgorithm2;
        }
        JWEAlgorithm jWEAlgorithm3 = RSA_OAEP_256;
        if (str.equals(jWEAlgorithm3.getName())) {
            return jWEAlgorithm3;
        }
        JWEAlgorithm jWEAlgorithm4 = A128KW;
        if (str.equals(jWEAlgorithm4.getName())) {
            return jWEAlgorithm4;
        }
        JWEAlgorithm jWEAlgorithm5 = A192KW;
        if (str.equals(jWEAlgorithm5.getName())) {
            return jWEAlgorithm5;
        }
        JWEAlgorithm jWEAlgorithm6 = A256KW;
        if (str.equals(jWEAlgorithm6.getName())) {
            return jWEAlgorithm6;
        }
        JWEAlgorithm jWEAlgorithm7 = DIR;
        if (str.equals(jWEAlgorithm7.getName())) {
            return jWEAlgorithm7;
        }
        JWEAlgorithm jWEAlgorithm8 = ECDH_ES;
        if (str.equals(jWEAlgorithm8.getName())) {
            return jWEAlgorithm8;
        }
        JWEAlgorithm jWEAlgorithm9 = ECDH_ES_A128KW;
        if (str.equals(jWEAlgorithm9.getName())) {
            return jWEAlgorithm9;
        }
        JWEAlgorithm jWEAlgorithm10 = ECDH_ES_A192KW;
        if (str.equals(jWEAlgorithm10.getName())) {
            return jWEAlgorithm10;
        }
        JWEAlgorithm jWEAlgorithm11 = ECDH_ES_A256KW;
        if (str.equals(jWEAlgorithm11.getName())) {
            return jWEAlgorithm11;
        }
        JWEAlgorithm jWEAlgorithm12 = A128GCMKW;
        if (str.equals(jWEAlgorithm12.getName())) {
            return jWEAlgorithm12;
        }
        JWEAlgorithm jWEAlgorithm13 = A192GCMKW;
        if (str.equals(jWEAlgorithm13.getName())) {
            return jWEAlgorithm13;
        }
        JWEAlgorithm jWEAlgorithm14 = A256GCMKW;
        if (str.equals(jWEAlgorithm14.getName())) {
            return jWEAlgorithm14;
        }
        JWEAlgorithm jWEAlgorithm15 = PBES2_HS256_A128KW;
        if (str.equals(jWEAlgorithm15.getName())) {
            return jWEAlgorithm15;
        }
        JWEAlgorithm jWEAlgorithm16 = PBES2_HS384_A192KW;
        if (str.equals(jWEAlgorithm16.getName())) {
            return jWEAlgorithm16;
        }
        JWEAlgorithm jWEAlgorithm17 = PBES2_HS512_A256KW;
        return str.equals(jWEAlgorithm17.getName()) ? jWEAlgorithm17 : new JWEAlgorithm(str);
    }

    public JWEAlgorithm(String str) {
        super(str, null);
    }
}

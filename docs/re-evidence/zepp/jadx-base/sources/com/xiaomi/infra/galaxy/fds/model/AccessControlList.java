package com.xiaomi.infra.galaxy.fds.model;

import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class AccessControlList {
    private final Map<GrantKey, Integer> a = new HashMap();
    private String b;

    public static class Grant {
        private String a;
        private Permission b;
        private GrantType c;

        public Grant(GrantKey grantKey, Permission permission) {
            this(grantKey.granteeId, permission, grantKey.type);
        }

        public static Grant fromString(String str) {
            int iLastIndexOf = str.lastIndexOf(":");
            Preconditions.checkState(iLastIndexOf >= 0);
            return new Grant(GrantKey.fromString(str.substring(0, iLastIndexOf)), Permission.valueOf(str.substring(iLastIndexOf + 1)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Grant grant = (Grant) obj;
            String str = this.a;
            if (str == null ? grant.a == null : str.equals(grant.a)) {
                return this.b == grant.b && this.c == grant.c;
            }
            return false;
        }

        public GrantKey getGrantKey() {
            return new GrantKey(this.a, this.c);
        }

        public String getGranteeId() {
            return this.a;
        }

        public Permission getPermission() {
            return this.b;
        }

        public GrantType getType() {
            return this.c;
        }

        public int hashCode() {
            String str = this.a;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            Permission permission = this.b;
            int iHashCode2 = (iHashCode + (permission != null ? permission.hashCode() : 0)) * 31;
            GrantType grantType = this.c;
            return iHashCode2 + (grantType != null ? grantType.hashCode() : 0);
        }

        public void setGranteeId(String str) {
            this.a = str;
        }

        public void setPermission(Permission permission) {
            this.b = permission;
        }

        public void setType(GrantType grantType) {
            this.c = grantType;
        }

        public String toString() {
            return getGrantKey().toString() + ":" + this.b.name();
        }

        public Grant(String str, Permission permission) {
            this(str, permission, GrantType.USER);
        }

        public Grant(String str, Permission permission, GrantType grantType) {
            this.a = str;
            this.b = permission;
            this.c = grantType;
        }
    }

    public static class GrantKey implements Comparable<GrantKey> {
        public final String granteeId;
        public final GrantType type;

        public GrantKey(String str, GrantType grantType) {
            this.granteeId = str;
            this.type = grantType;
        }

        public static GrantKey fromString(String str) {
            int iLastIndexOf = str.lastIndexOf(":");
            Preconditions.checkState(iLastIndexOf >= 0);
            return new GrantKey(str.substring(0, iLastIndexOf), GrantType.valueOf(str.substring(iLastIndexOf + 1)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GrantKey)) {
                return false;
            }
            GrantKey grantKey = (GrantKey) obj;
            return this.granteeId.equals(grantKey.granteeId) && this.type.equals(grantKey.type);
        }

        public int hashCode() {
            return (this.granteeId.hashCode() ^ this.type.hashCode()) + this.granteeId.length();
        }

        public String toString() {
            return this.granteeId + ":" + this.type.name();
        }

        @Override // java.lang.Comparable
        public int compareTo(GrantKey grantKey) {
            int iCompareTo = this.granteeId.compareTo(grantKey.granteeId);
            return iCompareTo == 0 ? this.type.compareTo(grantKey.type) : iCompareTo;
        }
    }

    public enum GrantType {
        USER,
        GROUP
    }

    public enum Permission {
        READ(1),
        WRITE(2),
        READ_OBJECTS(4),
        SSO_WRITE(8),
        FULL_CONTROL(255);

        private final int value;

        Permission(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }
    }

    public enum UserGroups {
        ALL_USERS,
        AUTHENTICATED_USERS
    }

    public void addGrant(Grant grant) {
        GrantKey grantKey = grant.getGrantKey();
        Integer num = this.a.get(grantKey);
        if (num == null) {
            this.a.put(grantKey, Integer.valueOf(grant.getPermission().getValue()));
            return;
        }
        this.a.put(grantKey, Integer.valueOf(grant.getPermission().getValue() | num.intValue()));
    }

    public void addGrants(List<Grant> list) {
        Iterator<Grant> it2 = list.iterator();
        while (it2.hasNext()) {
            addGrant(it2.next());
        }
    }

    public boolean checkGroupReadObjectsPermission(String str) {
        return checkPermission(str, GrantType.GROUP, Permission.READ_OBJECTS);
    }

    public boolean checkGroupReadPermission(String str) {
        return checkPermission(str, GrantType.GROUP, Permission.READ);
    }

    public boolean checkGroupWritePermission(String str) {
        return checkPermission(str, GrantType.GROUP, Permission.WRITE);
    }

    public boolean checkPermission(String str, GrantType grantType, Permission permission) {
        Integer num = this.a.get(new GrantKey(str, grantType));
        if (num != null) {
            return (num.intValue() & permission.getValue()) == permission.getValue();
        }
        return false;
    }

    public boolean checkUserReadPermission(String str) {
        return checkPermission(str, GrantType.USER, Permission.READ);
    }

    public boolean checkUserWritePermission(String str) {
        return checkPermission(str, GrantType.USER, Permission.WRITE);
    }

    public List<Grant> getGrantList() {
        LinkedList linkedList = new LinkedList();
        for (Map.Entry<GrantKey, Integer> entry : this.a.entrySet()) {
            GrantKey key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            Permission permission = Permission.FULL_CONTROL;
            if (iIntValue == permission.getValue()) {
                linkedList.add(new Grant(key, permission));
            } else {
                for (Permission permission2 : Permission.values()) {
                    if (permission2.getValue() != Permission.FULL_CONTROL.getValue() && (permission2.getValue() & entry.getValue().intValue()) > 0) {
                        linkedList.add(new Grant(key, permission2));
                    }
                }
            }
        }
        return linkedList;
    }

    public String getOwnerId() {
        return this.b;
    }

    public void setOwnerId(String str) {
        this.b = str;
    }
}

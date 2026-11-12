package ch.qos.logback.core.rolling.helper;

import am.j;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
class FileFinder {
    private static final String REGEX_MARKER_END = "(?:\uffff)?";
    private static final String REGEX_MARKER_START = "(?:\ufffe)?";
    private FileProvider fileProvider;

    public FileFinder(FileProvider fileProvider) {
        this.fileProvider = fileProvider;
    }

    private void findDirs(List<File> list, List<PathPart> list2, int i14, List<File> list3) {
        if (i14 >= list2.size() - 1) {
            return;
        }
        PathPart pathPart = list2.get(i14);
        for (File file : list) {
            if (this.fileProvider.isDirectory(file) && pathPart.matches(file)) {
                list3.add(file);
                findDirs(Arrays.asList(this.fileProvider.listFiles(file, null)), list2, i14 + 1, list3);
            }
        }
    }

    private List<File> findFiles(List<File> list, List<PathPart> list2, int i14) {
        ArrayList arrayList = new ArrayList();
        PathPart pathPart = list2.get(i14);
        int size = list2.size() - 1;
        Iterator<File> it = list.iterator();
        if (i14 >= size) {
            while (it.hasNext()) {
                File next = it.next();
                if (pathPart.matches(next)) {
                    arrayList.add(next);
                }
            }
        } else {
            while (it.hasNext()) {
                File next2 = it.next();
                if (this.fileProvider.isDirectory(next2) && pathPart.matches(next2)) {
                    arrayList.addAll(findFiles(Arrays.asList(this.fileProvider.listFiles(next2, null)), list2, i14 + 1));
                }
            }
        }
        return arrayList;
    }

    public static String regexEscapePath(String str) {
        String str2 = File.separator;
        if (!str.contains(str2)) {
            return j.m(REGEX_MARKER_START, str, REGEX_MARKER_END);
        }
        String[] strArrSplit = str.split(str2);
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            if (strArrSplit[i14].length() > 0) {
                strArrSplit[i14] = j.o(strArrSplit[i14], REGEX_MARKER_END, new StringBuilder(REGEX_MARKER_START));
            }
        }
        return TextUtils.join(File.separator, strArrSplit);
    }

    private List<String> toAbsolutePaths(List<File> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getAbsolutePath());
        }
        return arrayList;
    }

    public static String unescapePath(String str) {
        return str.replace(REGEX_MARKER_START, "").replace(REGEX_MARKER_END, "");
    }

    public List<PathPart> splitPath(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : str.split(File.separator)) {
            boolean z14 = str2.contains(REGEX_MARKER_START) && str2.contains(REGEX_MARKER_END);
            String strReplace = str2.replace(REGEX_MARKER_START, "").replace(REGEX_MARKER_END, "");
            if (z14) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new LiteralPathPart(TextUtils.join(File.separator, arrayList2)));
                    arrayList2.clear();
                }
                arrayList.add(new RegexPathPart(strReplace));
            } else {
                arrayList2.add(strReplace);
            }
        }
        if (!arrayList2.isEmpty()) {
            arrayList.add(new LiteralPathPart(TextUtils.join(File.separator, arrayList2)));
        }
        return arrayList;
    }

    public List<String> findDirs(String str) {
        List<PathPart> listSplitPath = splitPath(str);
        PathPart pathPart = listSplitPath.get(0);
        ArrayList arrayList = new ArrayList();
        findDirs(pathPart.listFiles(this.fileProvider), listSplitPath, 1, arrayList);
        return toAbsolutePaths(arrayList);
    }

    public List<String> findFiles(String str) {
        List<PathPart> listSplitPath = splitPath(str);
        return toAbsolutePaths(findFiles(listSplitPath.get(0).listFiles(this.fileProvider), listSplitPath, 1));
    }
}

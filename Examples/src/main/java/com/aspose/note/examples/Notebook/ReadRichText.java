package com.aspose.note.examples.Notebook;

import java.io.IOException;
import java.nio.file.Path;

import com.aspose.note.Notebook;
import com.aspose.note.RichText;
import com.aspose.note.examples.Utils;
import com.aspose.note.system.collections.Generic.IGenericList;

public class ReadRichText {
	public static void main(String... args) throws IOException {

		// ExStart:ReadRichText
		String inputFile = "Open Notebook.onetoc2";
		Path inputPath = Utils.getPath(ReadRichText.class, inputFile);
		Notebook rootNotebook = new Notebook(inputPath.toString());

		IGenericList<RichText> allRichTextNodes = rootNotebook.getChildNodes(RichText.class);
		for (RichText richTextNode : allRichTextNodes) {
			System.out.println(richTextNode.getText());
		}
		// ExEnd:ReadRichText
	}

}
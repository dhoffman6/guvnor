/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.guvnor.client.asseteditor.drools.enums;

import org.drools.guvnor.client.resources.DroolsGuvnorImageResources;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;

/**
 * Created with IntelliJ IDEA. User: raymondefa Date: 6/18/12 Time: 12:54 PM To
 * change this template use File | Settings | File Templates.
 */
public class DeleteButtonCell extends ButtonCell {
    @Override
    public void render(Context context,
                       SafeHtml data,
                       SafeHtmlBuilder sb) {
        ImageResource imageResource = DroolsGuvnorImageResources.INSTANCE.itemImages().deleteItemSmall();
        sb.appendHtmlConstant( "<input type=\"image\" src=\"" + imageResource.getURL() + "\"  tabindex=\"-1\">" );
        sb.appendHtmlConstant( "</input>" );
    }
}
